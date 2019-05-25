package airline;

public class Airline {
    private String destination;
    private int flightnumber;
    private String typePlane;
    private double departuretime;
    private String dayOfWeek;

    public Airline(String destination, int flightnumber, String tipePlane, double departuretime, String dayOfWeek) {
        this.destination = destination;
        this.flightnumber = flightnumber;
        this.typePlane = tipePlane;
        this.departuretime = departuretime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(int flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getTipePlane() {
        return typePlane;
    }

    public void setTipePlane(String tipePlane) {
        this.typePlane = tipePlane;
    }

    public double getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(double departuretime) {
        this.departuretime = departuretime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightnumber=" + flightnumber +
                ", tipePlane='" + typePlane + '\'' +
                ", departuretime=" + departuretime +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                '}';
    }
}
