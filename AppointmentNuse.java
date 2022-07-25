import java.util.Date;

import model.ISchedulable;

public class AppointmentNuse implements ISchedulable{
    private int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;
    private String time;
    
    // Getters
    public int getId() {
        return id;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }


    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void shcedule(Date date, String time) {
        // TODO Auto-generated method stub
        
    }

    
}

