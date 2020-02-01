public class Nurses extends Employees{

    public Nurses(String name, int paySalary, int EmpNumber){
        super(name,paySalary,62);
    }


    public void drawBloood(Patient patient) {
        patient.haveBloodDrawn(9);
    }

    @Override
    public void recievepay() {
        System.out.println("getpaid");
    }
}

