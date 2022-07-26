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

    // Overwriting the "showUser" method
    @Override
    public void showUser() {
        System.out.println("Role: Employee");
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departament: Oncologia");
    }
}
