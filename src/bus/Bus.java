package bus;

public class Bus {
    private int id;
    private String nameDriver;
    private String ioDriver;
    private int numberOfBus;
    private int routeOfBus;
    private String marka;
    private int year;
    private int mileage;

    public Bus(int id, int numberOfBus, int routeOfBus, int year, int mileage) {
        this.id = id;
        this.numberOfBus = numberOfBus;
        this.routeOfBus = routeOfBus;
        this.year = year;
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getIoDriver() {
        return ioDriver;
    }

    public void setIoDriver(String ioDriver) {
        this.ioDriver = ioDriver;
    }

    public int getNumberOfBus() {
        return numberOfBus;
    }

    public void setNumberOfBus(int numberOfBus) {
        this.numberOfBus = numberOfBus;
    }

    public int getRouteOfBus() {
        return routeOfBus;
    }

    public void setRouteOfBus(int routeOfBus) {
        this.routeOfBus = routeOfBus;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", nameDriver='" + nameDriver + '\'' +
                ", ioDriver='" + ioDriver + '\'' +
                ", numberOfBus=" + numberOfBus +
                ", routeOfBus=" + routeOfBus +
                ", marka='" + marka + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
