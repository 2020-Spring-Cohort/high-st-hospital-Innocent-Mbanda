public class Janitor extends Employees {

    private boolean sweeping=false;

    public Janitor(String name, int paySalary, int EmployeeNumber) {
        super(name, paySalary,222);

    }

    public boolean isSweeping() {
        return sweeping;
    }
    public void setSweeping(boolean status){
        sweeping = status;
    }


    @Override
    public void recievepay() {
        System.out.println("paid");
    }

    }



