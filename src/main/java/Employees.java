public class Employees {
    private final int employeeNumber;
    public boolean sweeping;
    private int payRate;
    private int paySalary;
    private String name;
    private boolean paid;
    private String Employees;
    private String specialty;




    public Employees(String name, int paySalary, int employeeNumber ) {
        this.name = name;
        this.paySalary = paySalary;
        this.employeeNumber= employeeNumber;
    }

    public String getName() {
        return name;
    }

    public int getPaySalary() {
        return paySalary;
    }



    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void recievepay() {
        this.paid = true;
    }


    @Override
    public String toString() {
        return "Employees " +
                "name " + name + "|" +'\'' +
                "sweeping " + sweeping +
                "| paySalary " + paySalary +

                " |paid " +  paid + "| " +
                " Specialty " + specialty;

    }

    public boolean asweeringPhone(){
        return true;
    }

    public boolean hasBeenPaid(){
        return paid;
    }
}




