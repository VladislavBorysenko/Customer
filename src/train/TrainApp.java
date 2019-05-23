package train;

import static train.TrainFinalNums.FINISH_POINT;
import static train.TrainFinalNums.TIME;
import static train.TrainManeger.*;

public class TrainApp {
    public static void main(String[] args) {

        Train[] trains = new Train[5];
        trains = createTrainsArray();

        listOfEndPointTrains(trains, FINISH_POINT);
        listOfEndPointAndAfterTimeTrains(trains, FINISH_POINT, TIME);
        listOfEndPointAndHasPlace(trains, FINISH_POINT);
    }
}
