package patient;

public class Application {
    public static void main(String[] args) {

        Patient[] patients = new Patient[6];
        patients[0] = new Patient(1, "Ivan", "Ivanov", "Ivanovich", "Chkalova str.", 12345, 54321, "ORZ");
        patients[1] = new Patient(2, "Petr", "Petrov", "Petrovich", "Bonanisheskaya str.", 22345, 54322, "Grip");
        patients[2] = new Patient(3, "Semen", "Semenov", "Semenovich", "Naukova aveny.", 3245, 5433, "Kor");
        patients[3] = new Patient(4, "Maxim", "Maximov", "Maximovich", "Peremoga str.", 42345, 54324, "ORZ");
        patients[4] = new Patient(5, "Anton", "Antonov", "Antonovich", "VLKSM str.", 52345, 54325, "Grip");
        patients[5] = new Patient(6, "Anatoliy", "Anatoliev", "Anatolievich", "Druzhbi str.", 62345, 54326, "Kor");


        String diagnos = "ORZ";
        diagnosPatientList(patients, diagnos);

        int minInterval = 54322;
        int maxInterval = 54325;
        diapazonOfMedicalCard(patients,minInterval,maxInterval);

    }

    public static void diagnosPatientList(Patient[] patients, String diagnos) {

        for (int i = 0; i < patients.length; i++) {
            if (diagnos.equals(patients[i].getDiagnos())) {
                System.out.println(patients[i].getName() + " " + patients[i].getSurname() + " has diagnos is " + patients[i].getDiagnos());
            }
        }
    }

    public static void diapazonOfMedicalCard (Patient[] patients,int minInterval, int maxInterval){
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getMedicineCartNumber() >= minInterval && patients[i].getMedicineCartNumber() <= maxInterval) {
                System.out.println(patients[i].getSurname() + " " + patients[i].getMedicineCartNumber());
            }

        }
    }

}
