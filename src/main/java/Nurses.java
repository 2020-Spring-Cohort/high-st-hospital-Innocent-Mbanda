public class Nurses extends Employees implements MedicalStaff {

    public Nurses(String name, int paySalary, int employeeNumber) {
        super(name, paySalary, 62);
    }


    @Override
    public void recievepay() {
        System.out.println("getpaid");
    }


    @Override
    public void drawBloood(Patient patient) {
        patient.haveBloodDrawn(9);
    }

    @Override
    public void treatingPatient(Patient patient) {
        patient.treatingPatient(5);
    }

    @Override
    public String toString() {
        return  "Nurse: "    + getName()   + "  salary " +   getPaySalary() +   " employeeNumber " + getEmployeeNumber();


    }
}

