import javax.print.Doc;
import java.util.Scanner;

public class HospitalApplication {

    public static void main(String[] args) {

        Doctors doc = new Doctors("Dr James", 90000, 12,"heart");
        System.out.println(doc);
        doc.recievepay();
        
        Janitor Janitor = new Janitor("Bob",400000,20);
        Nurses nurse =  new Nurses(" nurse Cynthia", 500000, 23);
        Receptionist reception = new Receptionist ("Jane", 450000, 12);
        Patient patient=new Patient("David", 20, 10);
        System.out.println(Janitor);
        System.out.println(nurse);
        System.out.println(reception);
        System.out.println(patient);




    }
}
