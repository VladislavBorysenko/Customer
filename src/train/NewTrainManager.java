package train;

import static train.utils.MyRandom.rnd;

public class NewTrainManager {


    public static String[] finishPoints = {"Kiev", "Harkiv", "Odesa", "Lviv", "Dnepr", "Nickolaev"};
    public static int[] numbers = {256, 133, 76, 115, 29, 99, 98};

    public static int NUMBER_OF_TRAINS = 100;

    public static void main(String[] args) {

        Train[] trains = new Train[NUMBER_OF_TRAINS];

        System.out.println(finishPoints[0]);
        System.out.println(finishPoints[5]);
        System.out.println(finishPoints[finishPoints.length - 1]);
        System.out.println(finishPoints[rnd(finishPoints.length - 1)]);
        System.out.println(finishPoints[rnd(5)]);


        for (int i = 0; i < NUMBER_OF_TRAINS; i++) {
            System.out.println(finishPoints[rnd(finishPoints.length - 1)]);
        }


        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < NUMBER_OF_TRAINS; i++) {
            System.out.println(numbers[rnd(finishPoints.length - 1)]);
        }
        System.out.println("--------------------------------------------------------");






        for (int i = 0; i < NUMBER_OF_TRAINS; i++) {

            String finishPoint = finishPoints[rnd(finishPoints.length - 1)];
            int number = numbers[rnd(finishPoints.length - 1)];

            Train newTrain = new Train(finishPoint, number);
            trains[i] = newTrain;
        }
        System.out.println("--------------------------------------------------------");




        for (int i = 0; i < NUMBER_OF_TRAINS; i++) {
            System.out.println(trains[i]);
        }
    }
}
