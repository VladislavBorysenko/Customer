package phone;

public class Abonent {
    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private String adress;
    private int creditCard;
    private double debit;
    private double credit;
    private int innerTime;
    private int outerTime;

    public Abonent(int id, String name, String surname, String fatherName, String adress, int creditCard, double debit, double credit, int innerTime, int outerTime) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.adress = adress;
        this.creditCard = creditCard;
        this.debit = debit;
        this.credit = credit;
        this.innerTime = innerTime;
        this.outerTime = outerTime;
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

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getInnerTime() {
        return innerTime;
    }

    public void setInnerTime(int innerTime) {
        this.innerTime = innerTime;
    }

    public int getOuterTime() {
        return outerTime;
    }

    public void setOuterTime(int outerTime) {
        this.outerTime = outerTime;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", adress='" + adress + '\'' +
                ", creditCard=" + creditCard +
                ", debit=" + debit +
                ", credit=" + credit +
                ", innerTime=" + innerTime +
                ", outerTime=" + outerTime +
                '}';
    }
}
