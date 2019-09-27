import java.util.Arrays;

/**
 * This AppointmentQueue is implemented by keeping track of where the front of the queue is
 * as well as keeping track of the size of the queue
 * Because this is not a standard first in first out queue we are also keeping track of
 * whether or not the queue is sorted. making this sort of a priority queue.
 * there are many ways to accomplish this however I went with occasionally calling a sort
 * if it is known the array is not sorted
 */
public class AppointmentQueue {

    Appointment[] appointments;

    int capacity; // literally just appointments.length
    int size; // the current size of the queue
    int front; // the front of the queue
    boolean sorted; // keep track if the queue is sorted

    public AppointmentQueue() {
        appointments = new Appointment[5];
        capacity = 5;
        size = 0;
        front = 0;
        sorted = true;
    }

    /**
     * Runtime Amortized O(1)
     * Adds an appointment to the end of the queue
     */
    public void push(Appointment appointment) {
        // Prevent an out of bounds exception
        // if at capacity decide on wheter to increase capacity of move array back to front
        if(size + front == capacity) {
            if (size > capacity / 2) _grow();
            else _rearrange();
        }

        // If an Appointment with a time less than the last appointment gets added we know the
        // queue is no longer sorted and will require to be sorted before the next pop
        if(sorted && size > 1 && appointment.compareTo(appointments[size+front-1]) >= 0) sorted = false;

        // Add the element to the end of the queue
        appointments[size + front] = appointment;
        // Increment the size
        ++size;
    }

    public Appointment pop() {
        // prevent null pointer exception
        // this case typically throws an exception
        if(size == 0) return null;

        // Sort if not sorted
        if(!sorted) _sort();

        // increment front
        front++;
        // decrement size
        size--;
        // return previous
        return appointments[front - 1];
    }

    /**
     * _sort, _grow, _rearrange are designed to be avoided at all cost.
     * this allows the runtimes for the standard pop/push to be Amortized O(1)
     */
    private void _sort() {
        // pull elements to the beginning
        _rearrange();
        // Sort. I am able to use Java's Arrays.sort because I implemented Comparable.comparesTo for Appointment
        Arrays.sort(appointments, front, size + front);
        sorted = true;
    }

    private void _grow() {
        // new length in this case scenario is typically doubled in order to prevent this case to happen often
        int newLength = capacity * 2;
        // Initialize a new array
        Appointment[] newAppts = new Appointment[newLength];
        // Copy size amount of elements starting at the front of appointments to the 0 index of newAppts
        System.arraycopy(appointments, front, newAppts, 0, size);
        // set appointments, capacity, and front
        appointments = newAppts;
        capacity = capacity * 2;
        front = 0;
    }

    private void _rearrange() {
        // Pull forward all elements to the front
        for(int i = 0; i < size; i++) appointments[i] = appointments[front+i];
        front = 0;
    }

    public void debug() {
        // Basic print of values for debugging
        System.out.println("start");
        System.out.println("size: " + size);
        System.out.println("front: " + front);
        System.out.println("capacity: " + capacity);
        for (int i = front; i < front + size; i++) {
            System.out.println(appointments[i]);
        }
        System.out.println("finished\n\n");
    }


}