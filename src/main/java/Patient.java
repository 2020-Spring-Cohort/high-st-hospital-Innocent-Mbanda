public class Patient {

    private int bloodLevel = 20;
    private int healthLevel =10;
    private String name;

    public Patient (String name, int bloodLevel, int healthLevel) {
        this.name =name;
        this.bloodLevel =bloodLevel;
        this.healthLevel =healthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return   "Patient:" +   name + "bloodLevel="  +   bloodLevel +",   healthLevel  =" + healthLevel;
    }

    public void haveBloodDrawn(int amountDrown) {
        bloodLevel-=amountDrown;
    }
    public void treatingPatient( int increaseLife){
        healthLevel +=increaseLife;
    }
}

