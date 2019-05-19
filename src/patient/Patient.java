package patient;

public class Patient {
    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private String adress;
    private int phoneNumber;
    private int medicineCartNumber;
    private String diagnos;

    public Patient(int id, String name, String surname, String fatherName, String adress, int phoneNumber, int medicineCartNumber, String diagnos) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.medicineCartNumber = medicineCartNumber;
        this.diagnos = diagnos;
    }

    public Patient(String name, String surname, String fatherName, String diagnos) {
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.diagnos = diagnos;
    }

    public Patient(String name, String diagnos) {
        this.name = name;
        this.diagnos = diagnos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicineCartNumber() {
        return medicineCartNumber;
    }

    public void setMedicineCartNumber(int medicineCartNumber) {
        this.medicineCartNumber = medicineCartNumber;
    }

    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", medicineCartNumber=" + medicineCartNumber +
                ", diagnos='" + diagnos + '\'' +
                '}';
    }
}
