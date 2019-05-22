package house;

public class Application {
    public static final int SUM_OF_ROOM = 2;
    public static final int MIN_FLOOR = 2;
    public static final int MAX_FLOOR = 5;
    public static final double SQUER = 50.;

    public static void main(String[] args) {

        House[] houses = new House[12];
        houses = createArray();

        //   methodOfSortFromRoom(houses, SUM_OF_ROOM);
        //  methodOfSortFromRoomAndFloor(houses, SUM_OF_ROOM, MIN_FLOOR, MAX_FLOOR);
        methodOfSquerListofHous(houses, SQUER);
    }

    private static House[] createArray() {
        System.out.println("Method: createArray" + '\n');

        House[] houses = new House[12];
        houses[0] = new House(1, 54.0, 2, 2, "Chkalova str.", "fivefloor", 50);
        houses[1] = new House(2, 35.0, 5, 1, "Naukova aveny.", "ninefloor", 50);
        houses[2] = new House(3, 69.0, 6, 3, "Peremoga str.", "sixstinfloor", 100);
        houses[3] = new House(3, 56.5, 9, 2, "Druzhbi str.", "fivefloor", 75);
        houses[4] = new House(2, 41.7, 1, 1, "Chkalova str.", "ninefloor", 50);
        houses[5] = new House(1, 36.0, 2, 1, "Naukova aveny.", "ninefloor", 100);
        houses[6] = new House(1, 39.0, 3, 1, "Peremoga str.", "sixstinfloor", 75);
        houses[7] = new House(2, 58.0, 4, 2, "Chkalova str.", "fivefloor", 100);
        houses[8] = new House(3, 81.0, 5, 3, "Peremoga str.", "ninefloor", 100);
        houses[9] = new House(3, 37.9, 7, 1, "Naukova aveny.", "fivefloor", 75);
        houses[10] = new House(2, 55.0, 1, 2, "Chkalova str.", "ninefloor", 75);
        houses[11] = new House(1, 45.0, 8, 1, "Druzhbi str.", "fivefloor", 100);
        return houses;
    }


    private static void methodOfSortFromRoom(House[] houses, int sumRoom) {
        System.out.println("Method: methodOfSortFromRoom ");

        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getNumberOfRooms() == sumRoom) {
                System.out.println("Sum room is: " + houses[i].getNumberOfRooms() + " Adress is " + houses[i].getAdress() + " Floor is " + houses[i].getFloor());
            }
        }
    }

    private static void methodOfSortFromRoomAndFloor(House[] houses, int sumRoom, int minFloor, int maxFloor) {
        System.out.println("Method: methodOfSortFromRoomAndFloor");

        for (int i = 0; i < houses.length; i++) {
            if ((houses[i].getNumberOfRooms() == sumRoom) && (houses[i].getFloor() >= minFloor && houses[i].getFloor() <= maxFloor)) {
                System.out.println("Sum room is: " + houses[i].getNumberOfRooms() + " Adress is " + houses[i].getAdress() + " Floor is " + houses[i].getFloor());
            }
        }
    }

    private static void methodOfSquerListofHous(House[] houses, double squer) {
        System.out.println("Method: methodOfSquerListofHous ");

        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getSquer() > squer) {
                System.out.println("Squer house is: " + houses[i].getSquer() + " Adress is " + houses[i].getAdress() + " Floor is " + houses[i].getFloor());
            }
        }
    }

}
