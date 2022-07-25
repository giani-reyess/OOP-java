public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email, String birthday){
        super(name, email, birthday);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
