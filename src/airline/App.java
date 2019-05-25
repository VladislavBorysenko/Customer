package airline;

import static airline.utils.AirlineFinalNums.*;
import static airline.utils.AirlineManager.*;

public class App {
    public static void main(String[] args) {
       Airline[] airlines= methodOfCreateAirlinesArr();

        methodOfPrintdestination(airlines,destination_final);

        methodOfPrintLisForDay(airlines,day_of_week);

        methodOfPrintLisForDayAndTime(airlines,day_of_week,departuretimes);

    }
}
