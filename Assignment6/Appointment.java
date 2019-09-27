import java.util.Date;

// Unsure if you have covered interfaces yet but I implement Comparable here only to use Arrays.sort
// I could have easily just implemented my own sort but this is faster.
public class Appointment implements Comparable<Appointment>{

    // Appointment Variables
    String name;
    String reason;
    Date time;

    // Constructor
    Appointment(String name, String reason, Date time){
        this.name = name;
        this.reason = reason;
        this.time = time;
    }

    //Getters
    public Date getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    // Overriden for quicker sort implementation
    @Override
    public int compareTo(Appointment o){
        // returns a negative number is the Current Appointment is before the Targeted Appointment
        // and vice versa
        return (int) (time.getTime() - o.getTime().getTime());
    }


    // Mainly used for debugging
    @Override
    public String toString(){
        return String.format("%s has an appointment at %s for %s", name, time, reason);
    }


}