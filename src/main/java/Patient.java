public class Patient {

    private int bloodLevel = 20;
    private int healthlevel =10;

    public void haveBloodDrawn(int amountOfBloodDrown) {
        bloodLevel -= amountOfBloodDrown;
    }

    public int getHealthlevel(int patientBloodLevel) {
        return healthlevel;


        }


    public int getBloodLevel(){
        return bloodLevel;
    }
}
