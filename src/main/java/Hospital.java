import java.util.ArrayList;
import java.util.HashMap;



public class Hospital {
    private HashMap<String, Employees> employeeList = new HashMap<>();

    public void hire(Employees testEmployee) {
        employeeList.put(testEmployee.getName(), testEmployee);


    }

    public HashMap<String, Employees> getEmployeeList() {
        return employeeList;
    }

    public void PayAllEmployees() {
        for( Employees EmployeesTobePaid:employeeList.values()){
            EmployeesTobePaid.recievepay();

        }



    }
}



