public class Doctors extends Employees{


        private String specificity;

        public Doctors(String name, int paySalary, int empNumber,String specificity){
                super(name, paySalary,empNumber);
                System.out.println("name" +paySalary);
                this.specificity= specificity;
        }


        public void drawBloood(Patient patient) {
                patient.haveBloodDrawn(5);
        }

        public String getSpecification() {
                return specificity;
        }
}

