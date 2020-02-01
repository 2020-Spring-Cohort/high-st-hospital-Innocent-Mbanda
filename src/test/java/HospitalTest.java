import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    private Hospital  underTest;
    private Employees testEmployees;
    @BeforeEach
    void setUp(){
        underTest = new Hospital();
        testEmployees = new Employees("Testemployee", 900000, 23) {

        };
        underTest.hire(testEmployees);
    }
    @Test
    public void shouldBeAbleToHire(){

        assertEquals(1, underTest.getEmployeeList().size());
        Doctors doc = new Doctors("bob", 900000,22,"heart" );
        underTest.hire(doc);
        assertEquals(2, underTest.getEmployeeList().size());
    }
    @Test
    public void shouldbeAbleToPayllEmployees(){
        underTest.PayAllEmployees();
        for (Employees testEmp: underTest.getEmployeeList().values()) {
            assertEquals(true, testEmp.hasBeenPaid());
        }


    }

    }








