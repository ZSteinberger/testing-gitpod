import java.util.Arrays;

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
        sorted = false;
    }

    public void push(Appointment appointment) {
        if(size + front == capacity) {
            if (size > capacity / 2) _grow();
            else _rearrange();
        }

        if(sorted && size > 1 && appointment.compareTo(appointments[size+front-1]) >= 0) sorted = false;
        appointments[size + front] = appointment;
        ++size;
    }

    public Appointment pop() {
        if(size == 0) return null;
        if(!sorted) _sort();

        int place = front;
        front++;
        size--;
        return appointments[place];
    }

    private void _sort() {
        _rearrange();
        Arrays.sort(appointments, front, size + front);
        sorted = true;
    }

    private void _grow() {
        int newLength = capacity * 2;
        Appointment[] newAppts = new Appointment[newLength];
        System.arraycopy(appointments, front, newAppts, 0, size);
        appointments = newAppts;
        capacity = capacity * 2;
        front = 0;
    }

    private void _rearrange() {
        for(int i = 0; i < size; i++) appointments[i] = appointments[front+i];
        front = 0;
    }

    public void debug() {
        System.out.println("start");
        System.out.println("size: " + size);
        System.out.println("front: " + front);
        System.out.println("capacity: " + capacity);
        for (int i = front; i < front + size; i++) {
            System.out.println(appointments[i].toString());
        }
        System.out.println("finished");
    }


}