package house;

public class Application {
    public static void main(String[] args) {

    }

    private static House[] createArray() {
        House[] houses = new House[12];
        houses[0] = new House(1, 54.0, 2, 2, "Chkalova str.", "fivefloor", 50);
        houses[1] = new House(2, 35.0,5 , 1, "Naukova aveny.", "ninefloor", 50);
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
}
