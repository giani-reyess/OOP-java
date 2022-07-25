public class Patient extends User{
    private double weight;
    private double height;
    private String blood;
    
    public Patient(String name, String email, String birthday){
        super(name, email, birthday);       
    }

    @Override
    public String toString(){
        return super.toString() + "\nAge: " +getBirthday()+ "\n Weight:" 
        +getWeight()+ "\n Height: " +getHeight()+ "\n Blood: " +blood;
    }

    // 54.5
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 54.5 Kg. String
    public String getWeight(){
        return this.weight + " Kg.";
    }


    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}



