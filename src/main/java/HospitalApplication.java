import javax.print.Doc;
import java.util.Scanner;

public class HospitalApplication {

    public static void main(String[] args) {

        Doctors doc = new Doctors("Dr James", 90000, 92,"heart");
        System.out.println(doc);
       // Patient patient = new Patient();
        Janitor jn = new Janitor("Bob", 400000, 222);
        Nurses nurse =  new Nurses(" nurse Cynthia", 500000, 23);
        Receptionist reception = new Receptionist("Jane", 450000, 12);

        System.out.println(jn);
        System.out.println(nurse);
        System.out.println(reception);






       // System.out.println("Patient blood level at " + patient.getBloodLevel());
      // System.out.println("would you like to draw blood?");
    // Scanner scanner = new Scanner(System.in);
    // if (scanner.nextLine().equalsIgnoreCase("Yes")){
     //   doc.drawBloood(patient);
  //      System.out.println("Patient blood level at " + patient.getBloodLevel());
     //  }



    }
}
