/**
 * Requirements:

1. You shall create three classes: a main class called "Assignment6", an "Appointment" class, and an "AppointmentQueue" class

2. The “Appointment” class will hold the information for a single appointment (name, reason, time).

3. The “AppointmentQueue” class will hold all of the appointment objects. This queue class should at least have "push" and "pop" methods for adding and removing from the queue (more may be needed). The earliest remaining appointment should come off the queue when "pop" is called.

Flow of the program:

1. Read in all the appointments from the data file, create an "Appointment" object for each one, and add each one to an "AppointmentQueue". The data file to read from is here: DMV_Appointments.txtPreview the document

2. Prompt the user to enter their name and then determine whether or not they are next in the queue

3. If they are next, output to the screen that the DMV will help them now and remove them from the queue. If they are not next, give them a harsh rejection message like the DMV usually does.

4. Keep prompting for the next person until everyone has been helped.

The Hard Part:

Your "AppointmentQueue" class must use a basic array of initial size 5 to hold the appointments. When the "push" method is called, your class must be able to automatically expand the array when needed to fit additional appointment objects.
didnt do "hard part" either
all my classes are canceled today
 */
import java.util.Date;
class Assignment6 {
    public static void main(String[] args)
    {
        System.out.println("Hello Worlds");
        AppointmentQueue aq = new AppointmentQueue();
        Appointment a1 = new Appointment("zach", "pi", new Date(2019, 8, 12, 12, 0));
        Appointment a2 = new Appointment("revi", "steak", new Date(2019, 8, 12, 12, 30));
        Appointment a3 = new Appointment("steph", "cake", new Date(2019, 8, 12, 13, 00));
        Appointment a4 = new Appointment("chels", "pie", new Date(2019, 8, 12, 13, 30));
        Appointment a5 = new Appointment("chels", "pie", new Date(2019, 8, 12, 14, 00));
        Appointment a6 = new Appointment("chels", "pie", new Date(2019, 8, 12, 14, 30));
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);
        aq.debug();
        aq.debug();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);
        aq.debug();

        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);

        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(a2);
        aq.push(a5);
        aq.push(a4);
        aq.push(a3);
        aq.push(a6);
        aq.push(a1);
        aq.pop();
        aq.debug();
    }
}