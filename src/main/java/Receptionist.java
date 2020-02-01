public class Receptionist extends Employees{


    private boolean answeringPhone=false;

    public Receptionist(String name, int paySalary, int EmpNumber){
        super(name,paySalary,77);
    }

    public boolean isAnsweringPhone() {
        return answeringPhone;
    }
    public void setAnswering(boolean status){
        sweeping = status;
    }


    @Override
    public void recievepay() {
        System.out.println("getPaid");
    }
}

