import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.PortUnreachableException;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    private Employees underTest;
    private Doctors specifity;


    @BeforeEach
    void setUpTest() {
        underTest = new Employees("TESTNAME", 900000, 111) {
            @Override
            public String getName() {
                return super.getName();
            }
        } ;
    }


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
        Janitor textjanitor = new Janitor("bob", 10000, 222);
        textjanitor.setSweeping(true);
        assertThat(textjanitor.isSweeping());

    }
    @Test
    public void janitorIsSweeping() {
        Janitor textjanitor = new Janitor("bob", 10000, 222);
        textjanitor.setSweeping(false);
        assertThat(textjanitor.isSweeping());
    }

    @Test
    public void receptionalistShoubeAnswerPhone() {
        Receptionist recievingcall = new Receptionist("Cynthia", 45000, 23);
    }

        @Test
        public void doctorCanGetPaid () {
            Doctors testDoctor = new Doctors("Billy", 90000, 128,"heart");
            testDoctor.recievepay();
            assertEquals(true, testDoctor.hasBeenPaid());

        }

        @Test
        public void doctorCanDrawBlood () {
            Doctors testDoctor = new Doctors("james", 90000, 92,"heart");
            Patient patient = new Patient();
            testDoctor.drawBloood(patient);
            assertEquals(15, patient.getBloodLevel());
        }

    @Test
    public void nursesCanDrawBlood () {
        Doctors testDoctor = new Doctors("Fatuma", 50000, 62,"heart");
        Patient patient = new Patient();
        testDoctor.drawBloood(patient);
        assertEquals(15, patient.getBloodLevel());
    }

    @Test
    public void doctShouldSpecification(){
        Doctors underTest = new Doctors("bob", 90000, 33,"heart");
        String result =underTest.getSpecification();
        assertEquals("heart",result);
    }


    }








