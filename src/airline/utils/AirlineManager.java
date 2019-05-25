package airline.utils;

import airline.Airline;

import static airline.utils.AirlineFinalNums.*;
import static train.utils.MyRandom.rnd;

public class AirlineManager {


    public static Airline[] methodOfCreateAirlinesArr() {
        Airline[] airlines = new Airline[NUMBER_OF_AIRLINES];


        for (int i = 0; i < NUMBER_OF_AIRLINES; i++) {

            String typePlane = TYPE_PLANES[rnd(TYPE_PLANES.length - 1)];
            String destination = DESTINATIONS[rnd(TYPE_PLANES.length - 1)];
            int flightnumber = FLIGHTNUMBERS[rnd(TYPE_PLANES.length - 1)];
            double departuretime = DEPARTURETIMES[rnd(TYPE_PLANES.length - 1)];
            String dayOfWeek = DAY_OF_WEEKS[rnd(TYPE_PLANES.length - 1)];

            Airline newAirline = new Airline(destination, flightnumber, typePlane, departuretime, dayOfWeek);
            airlines[i] = newAirline;
        }

        return airlines;
    }

    public static Airline[] methodOfPrintdestination(Airline[] airlines, String destination_final) {
        System.out.println("Method: methodOfPrintdestination");
        boolean isFoundDestination = false;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDestination().equals(destination_final)) {
                System.out.println(airlines[i]);
                isFoundDestination = true;
            }

        }
        if (isFoundDestination = false) {
            System.out.println("Destination not Found");
        }
        return airlines;
    }

    public static Airline[] methodOfPrintLisForDay(Airline[] airlines, String dayofweek) {
        System.out.println("Method: methodOfPrintLisForDay");
        boolean isFoundDay = false;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getDayOfWeek().equals(dayofweek)) {
                System.out.println(airlines[i]);
                isFoundDay = true;
            }

        }
        if (isFoundDay = false) {
            System.out.println("Destination not Found");
        }
        return airlines;
    }

    public static Airline[] methodOfPrintLisForDayAndTime(Airline[] airlines, String dayOfweek, double time) {
        System.out.println("Method: methodOfPrintLisForDayAndTime");
        boolean isFoundDayOfWeekAndTime = false;
        for (int i = 0; i < airlines.length; i++) {
            if ((airlines[i].getDayOfWeek().equals(dayOfweek)) && (airlines[i].getDeparturetime() > time)) {
                System.out.println(airlines[i]);
                isFoundDayOfWeekAndTime = true;
            }
        }
        if (isFoundDayOfWeekAndTime = false) {
            System.out.println("Destination not Found");
        }
        return airlines;
    }
}

