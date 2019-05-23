package car;

public class Application {
    public static final String MARK = "BMW";
    public static final String MODEL = "I5";
    public static final int YEAR = 1980;
    public static final int PRICE = 50;

    public static void main(String[] args) {

        Car[] cars = new Car[12];
        cars = createArray();
        //  listOfMark(cars, MARK);
        //  listOfOldModel(cars, YEAR, MODEL);
        listOfOldCarForPrice(cars,YEAR,PRICE);
    }

    private static Car[] createArray() {

        System.out.println("Method: createArray");
        Car[] cars = new Car[12];
        cars[0] = new Car(1, "BMW", "I3", 1990, "yelow", 56, 1);
        cars[1] = new Car(2, "Opel", "Omega", 1992, "black", 78, 2);
        cars[2] = new Car(3, "BMW", "I5", 1989, "white", 95, 3);
        cars[3] = new Car(4, "Mercedess", "C500", 1958, "green", 12, 4);
        cars[4] = new Car(5, "Nissan", "Primera", 1965, "red", 30, 5);
        cars[5] = new Car(6, "BMW", "I7", 1958, "silver", 47, 6);
        cars[6] = new Car(7, "Mercedess", "ZX300", 1965, "purple", 56, 7);
        cars[7] = new Car(8, "Opel", "Kadet", 1989, "grey", 78, 8);
        cars[8] = new Car(9, "Reno", "Fuga", 1992, "red", 90, 9);
        cars[9] = new Car(10, "Ford", "furi", 1990, "black", 50, 10);
        cars[10] = new Car(11, "Ford", "Zenith", 1991, "silver", 60, 11);
        cars[11] = new Car(12, "Ford", "mondeu", 1991, "white", 77, 12);
        return cars;
    }

    public static void listOfMark(Car[] cars, String mark) {
        System.out.println("Method: listOfMark ");

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getMark().equals(mark)) {
                System.out.println(cars[i]);
            } else {
                System.out.println("NOT FOUND");
            }

        }

    }


    public static void listOfOldModel(Car[] cars, int year, String model) {
        System.out.println("Method: listOfOldModel ");

        for (int i = 0; i < cars.length; i++) {
            if ((cars[i].getYear() > year) && (cars[i].getModel().equals(model))) {
                int a= i;
                System.out.println(cars[a]);
                break;
            }else {
                System.out.println("Not Found");
            }
        }

    }

    public static void listOfOldCarForPrice(Car[] cars, int year, int price) {
        System.out.println("Method: listOfOldModel ");

        for (int i = 0; i < cars.length; i++) {
            if ((cars[i].getYear() > year) && (cars[i].getPrice() >= price)) {
                System.out.println(cars[i]);
            }

        }

    }
}
