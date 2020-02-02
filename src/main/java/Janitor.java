public class Janitor extends Employees {

    private boolean sweeping = false;

    public Janitor(String name, int paySalary, int employeeNumber) {
        super(name, paySalary, employeeNumber);

    }

    public boolean isSweeping() {
        return sweeping;
    }

    public void setSweeping(boolean status) {
        sweeping = status;
    }


    @Override
    public void recievepay() {
        System.out.println("paid");
    }

    @Override
    public String toString() {
        return  "Janitor: "    + getName()   + "  salary " +   getPaySalary() +   " employeeNumber " + getEmployeeNumber() +   " sweeping " + sweeping;


    }
}



