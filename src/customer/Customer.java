package customer;

import java.util.Comparator;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String fatherName;
    private String adress;
    private int creditCard;
    private int score;

    public Customer(){
    }

    public Customer(int id, String name, String sername, String fatherName, String adress, int creditCard, int score) {
        this.id = id;
        this.name = name;
        this.surname = sername;
        this.fatherName = fatherName;
        this.adress = adress;
        this.creditCard = creditCard;
        this.score = score;
    }

    public Customer(String name, int creditCard) {
        this.name = name;
        this.creditCard = creditCard;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", adress=" + adress +
                ", creditCard=" + creditCard +
                ", score=" + score +
                '}';
    }
}



class ComparatorBySurname implements Comparator {

    public int compare(Object o1, Object o2) {
        return ((Customer) o1).getSurname().compareTo(((Customer) o2).getSurname());
    }
}
