public class Employees {
    public boolean sweeping;
    private int payRate;
    private int paySalary;
    private String name;
    private boolean paid;
    private String Employees;







    public Employees(String name, int paySalary, int EmployeeNumber ) {
        this.name = name;
        this.paySalary = paySalary;
        //this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public int getPaySalary() {
        return paySalary;
    }


    public int getEmployeeNumber() {
        return 0;
    }

    public void recievepay() {
        this.paid = true;
    }


    @Override
    public String toString() {
        return "Employees " +
                "name " + name + "|" +'\'' +
                "sweeping " + sweeping +
                "| paySalary |" + paySalary +

                " |paid |" + paid +
                '|';

    }

    public boolean asweeringPhone(){
        return true;
    }

    public boolean hasBeenPaid(){
        return paid;
    }
}




