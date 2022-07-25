// import static ui.UIMenu.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Doctor instantiation
        Doctor myDoctor = new Doctor("Giani Reyes", "giani@gmail.com", "12/24/2002");
        myDoctor.addAvaibleAPpointment(new Date(), "4pm");
        myDoctor.addAvaibleAPpointment(new Date(), "1pm");
        myDoctor.addAvaibleAPpointment(new Date(), "9am");

        System.out.println(myDoctor);
    
        System.out.println("\n");

        // Patient instantiation
        Patient myPatient = new Patient("Inaig Seyer", "in4ig.seyer@gmail.com", "24/12/2002");
        myPatient.setWeight(64.0);  
        myPatient.setHeight(170.0);  
        myPatient.setBlood("Common");  
        System.out.println(myPatient);
    }
}
