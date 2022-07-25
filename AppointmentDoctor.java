import java.util.Date;

import model.ISchedulable;

public class AppointmentDoctor implements ISchedulable{
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    // Getters
    public int getId() {
        return id;
    }

    public Doctor getDoctor() {
        return doctor;
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

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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
