package bus;

public class BusManager {
    public static int ROUTE_OF_BUS = 262;
    public static int YEAR_BUS = 2000;
    public static int MILIEAGE = 5000;


    public static Bus[] createBusesArray() {

        System.out.println("Method: createArray");
        Bus[] buses = new Bus[7];
        buses[0] = new Bus(1, 1, 52, 1998, 4500);
        buses[1] = new Bus(2, 2, 262, 1999, 5015);
        buses[2] = new Bus(3, 3, 147, 2001, 5005);
        buses[3] = new Bus(4, 4, 262, 1995, 3084);
        buses[4] = new Bus(5, 6, 147, 2005, 8600);
        buses[5] = new Bus(6, 5, 52, 1990, 3560);
        buses[6] = new Bus(7, 7, 262, 2001, 1000);

        return buses;
    }

    public static Bus[] printListOfRouteBus(Bus[] buses, int routeOfBus) {
        System.out.println("Run Method: printListOfRouteBus ");
        boolean routBusIsFaund = false;
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].getRouteOfBus() == routeOfBus) {
                System.out.println(buses[i]);
                routBusIsFaund = true;
            }
        }
        if (routBusIsFaund = false) {
            System.out.println("Not found");
        }
        return buses;
    }

    public static Bus[] printListOfMaxYearBus(Bus[] buses, int year) {
        System.out.println("Run Method: printListOfMaxYearBus");
        boolean yearBusIsFaund = false;
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].getYear() > year) {
                System.out.println(buses[i]);
                yearBusIsFaund = true;
            }
        }
        if (yearBusIsFaund = false) {
            System.out.println("Not found");
        }
        return buses;
    }

    public static Bus[] printListOfMaxBusMileage(Bus[] buses, int miliege) {
        System.out.println("Run Method: printListOfMaxBusMileage ");
        boolean miliegeIsFound = false;
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].getMileage() > miliege) {
                System.out.println(buses[i]);
                miliegeIsFound = true;
            }

        }
        if (miliegeIsFound = false) {
            System.out.println("Not found");
        }
        return buses;
    }


}
