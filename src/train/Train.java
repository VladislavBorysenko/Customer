package train;

public class Train {
    private int id;
    private String finishPoint;
    private int numberOfTrain;
    private double timeOfStart;
    private int place;
    private int kupe;
    private int lux;
    private int plackart;


    public Train(int id, String finishPoint, int numberOfTrain, double timeOfStart, int place, int kupe, int lux, int plackart) {
        this.id = id;
        this.finishPoint = finishPoint;
        this.numberOfTrain = numberOfTrain;
        this.timeOfStart = timeOfStart;
        this.place = place;
        this.kupe = kupe;
        this.lux = lux;
        this.plackart = plackart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinishPoint() {
        return finishPoint;
    }

    public void setFinishPoint(String finishPoint) {
        this.finishPoint = finishPoint;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public double getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(double timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getKupe() {
        return kupe;
    }

    public void setKupe(int kupe) {
        this.kupe = kupe;
    }

    public int getLux() {
        return lux;
    }

    public void setLux(int lux) {
        this.lux = lux;
    }

    public int getPlackart() {
        return plackart;
    }

    public void setPlackart(int plackart) {
        this.plackart = plackart;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", finishPoint='" + finishPoint + '\'' +
                ", numberOfTrain=" + numberOfTrain +
                ", timeOfStart=" + timeOfStart +
                ", place=" + place +
                ", kupe=" + kupe +
                ", lux=" + lux +
                ", plackart=" + plackart +
                '}';
    }
}
