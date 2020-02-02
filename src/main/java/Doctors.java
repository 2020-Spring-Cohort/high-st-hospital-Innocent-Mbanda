public class Doctors extends Employees implements MedicalStaff {

        private String specialty;

        public Doctors(String name, int paySalary, int employeeNumber,String specialty){
                super(name, paySalary,employeeNumber);



                this.specialty = specialty;

        }

        public String getSpecialty() {
                return specialty;
        }



        public String getSpecification() {
                return specialty;

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
                return  "Doctor: "    + getName()   + "  salary " +   getPaySalary() +   " employeeNumber " + getEmployeeNumber() +   " specialty " + specialty;


        }
}

