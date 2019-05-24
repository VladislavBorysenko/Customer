package bus;

import static bus.BusFinalNums.*;
import static bus.BusManager.*;

public class BusApp {
    public static void main(String[] args) {
        Bus[] buses = new Bus[7];
        buses = createBusesArray();
         printListOfRouteBus(buses,ROUTE_OF_BUS);
        printListOfMaxYearBus(buses, YEAR_BUS);
        printListOfMaxBusMileage(buses, MILIEAGE);
    }
}
