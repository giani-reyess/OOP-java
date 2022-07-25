public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;

    public User(String name, String email, String birthday){
        this.name =  name;
        this.email = email;
        this.birthday = birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número telefónico debe ser de 8 dígitos máximo");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }

    }

    @Override
    public String toString(){
        return "User: " +name+ ", Email: " +email+ 
                "\n Adress: " +address+". Phone: " +phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

