import java.util.ArrayList;
import java.util.Date;

// Exterior class: Doctor 
public class Doctor extends User{
    private String speciality;


    public Doctor(String name, String email, String birthday){
        super(name, email, birthday);
    }

    @Override
    public String toString(){
        return super.toString() + "\n User: " +speciality+ ", Avaible: " +avaibleAPpointments.toString();
    }
    
    
    // Setter for apointments creation
    ArrayList<AvaibleAPpointment> avaibleAPpointments = new ArrayList<>(); 
    public void addAvaibleAPpointment(Date date, String time){
        avaibleAPpointments.add(new AvaibleAPpointment(date,time));
    }
    
    // Getter for apointments reading
    public ArrayList<AvaibleAPpointment> getAvaibleAPpointments() {
        return avaibleAPpointments;
    }
    
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // Nested class: AvaibleAPpointment 
    public static class AvaibleAPpointment{
        private int id;
        private Date date;
        private String time;

        // Class constructor 
        public AvaibleAPpointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        @Override
        public String toString(){
            return super.toString() + "\n Date: " +date+ ", \n Time: " + time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getId() {
            return id;
        }

    }
} 