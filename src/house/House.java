package house;

public class House {
    private int number;
    private double squer;
    private int floor;
    private int numberOfRooms;
    private String adress;
    private String tipe;
    private int lifetime;

    public House(int number, double squer, int floor, int numberOfRooms, String adress, String tipe, int lifetime) {
        this.number = number;
        this.squer = squer;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.adress = adress;
        this.tipe = tipe;
        this.lifetime = lifetime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSquer() {
        return squer;
    }

    public void setSquer(double squer) {
        this.squer = squer;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", squer=" + squer +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", adress='" + adress + '\'' +
                ", tipe='" + tipe + '\'' +
                ", lifetime=" + lifetime +
                '}';
    }
}
