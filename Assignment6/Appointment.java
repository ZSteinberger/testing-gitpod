import java.util.Date;

public class Appointment implements Comparable<Appointment>{
    String name;
    String reason;
    Date time;

    Appointment(String name, String reason, Date time){
        this.name = name;
        this.reason = reason;
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public int compareTo(Appointment o){
        return (int) (time.getTime() - o.getTime().getTime());
    }

    @Override
    public String toString(){
        return String.format("%s has an appointment at %s for %s", name, time, reason);
    }


}