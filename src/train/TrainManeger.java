package train;

public class TrainManeger {


    public static Train[] createTrainsArray() {

        System.out.println("Method: createArray");
        Train[] trains = new Train[7];
        trains[0] = new Train(1, "Kiev", 256, 15.30, 45, 12, 0, 0);
        trains[1] = new Train(2, "Harkiv", 133, 21.22, 50, 15, 2, 0);
        trains[2] = new Train(3, "Odesa", 76, 20.15, 0, 0, 4, 5);
        trains[3] = new Train(4, "Lviv", 115, 10.40, 30, 8, 4, 6);
        trains[4] = new Train(5, "Dnepr", 29, 11.40, 0, 8, 6, 0);
        trains[5] = new Train(6, "Odesa", 99, 18.00, 35, 6, 0, 0);
        trains[6] = new Train(7, "Lviv", 98, 7.00, 0, 0, 0, 0);

        return trains;
    }

    public static Train[] listOfEndPointTrains(Train[] trains, String finishPoint) {
        System.out.println("Method list of finish point trains");

        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getFinishPoint().equals(finishPoint)) {
                System.out.println(trains[i]);
            }

        }
        return trains;
    }

    public static Train[] listOfEndPointAndAfterTimeTrains(Train[] trains, String finishPoint, double time) {
        System.out.println("Method listOfEndPointAndAfterTimeTrains" + '\n' + "----------------------------------------");

        for (int i = 0; i < trains.length; i++) {
            if ((trains[i].getFinishPoint().equals(finishPoint)) && (trains[i].getTimeOfStart() > time)) {
                System.out.println(trains[i]);
            }

        }
        return trains;
    }

    public static Train[] listOfEndPointAndHasPlace(Train[] trains, String finishPoint) {
        System.out.println("Method listOfEndPointAndAfterTimeTrains" + '\n' + "----------------------------------------");

        for (int i = 0; i < trains.length; i++) {
            if ((trains[i].getFinishPoint().equals(finishPoint)) && (trains[i].getTimeOfStart() > 0)) {
                System.out.println(trains[i]);
            }

        }
        return trains;
    }

}
