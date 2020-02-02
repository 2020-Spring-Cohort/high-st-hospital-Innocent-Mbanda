import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.PortUnreachableException;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    private Employees underTest;
    private Doctors specifity;
    private Doctors testNurse;



    @Test
    public void employeeShouldHaveName() {
        String result = underTest.getName();
        assertEquals("TESTNAME", result);
    }

   // @Test
   // public void employeeShouldAnotherName() {
   //     Employees underTest = new Employees("John", 400000, 1111) {
   //     };
  //      String result = underTest.getName();
   //     assertEquals("John", result);

  //  }

    @Test

    public void employeeShouldGetPaid() {
        int paySalary = underTest.getPaySalary();
        assertEquals(900000, paySalary);
    }

    @Test
    public void employeeShouldHaveNumber() {
        int number = underTest.getEmployeeNumber();

        assertEquals(0, number);

    }

    @Test
    public void janitorIsNotSweeping() {
        Janitor textjanitor = new Janitor("bob", 40000, 20);
        textjanitor.setSweeping(true);
        assertThat(textjanitor.isSweeping());

    }
    @Test
    public void janitorIsSweeping() {
        Janitor textjanitor = new Janitor("bob", 40000, 20);
        textjanitor.setSweeping(false);
        assertThat(textjanitor.isSweeping());
    }

    @Test
    public void receptionalistShoubeAnswerPhone() {
        Receptionist recievingcall = new Receptionist("Cynthia", 45000, 23);
    }

        @Test
        public void doctorCanGetPaid () {
            Doctors testDoctor = new Doctors("Dr Billy", 90000, 12,"heart");
            testDoctor.recievepay();
            assertTrue(testDoctor.hasBeenPaid());

        }

        @Test
        public void doctorCanDrawBlood () {
            Doctors testDoctor = new Doctors("Dr Billy ", 90000, 12,"heart");
            Patient patient = new Patient("",20,10);
            testDoctor.drawBloood(patient);
            assertEquals(11, patient.getBloodLevel());
        }

    @Test
    public void nursesCanDrawBlood () {
        Nurses nurses = new Nurses("Jane", 50000, 62);
        Patient patient = new Patient("",20,10);
        testNurse.drawBloood(patient);
        assertEquals(11, patient.getBloodLevel());
    }

    @Test
    public void doctShouldSpecification(){
        Doctors underTest = new Doctors("bob", 90000, 33,"heart");
        String result =underTest.getSpecialty();
        assertEquals("heart",result);
    }


    }








