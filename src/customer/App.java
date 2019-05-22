package customer;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Customer[] customers = new Customer[6];
        customers[0] = new Customer(1, "Ivan", "Ivanov", "Ivanovich", "Chkalova str.", 12345, 54321);
        customers[1] = new Customer(2, "Petr", "Petrov", "Petrovich", "Bonanisheskaya str.", 22345, 54322);
        customers[2] = new Customer(3, "Semen", "Semenov", "Semenovich", "Naukova aveny.", 3245, 5433);
        customers[3] = new Customer(4, "Maxim", "Maximov", "Maximovich", "Peremoga str.", 42345, 54324);
        customers[4] = new Customer(5, "Anton", "Antonov", "Antonovich", "VLKSM str.", 52345, 54325);
        customers[5] = new Customer(6, "Anatoliy", "Anatoliev", "Anatolievich", "Druzhbi str.", 62345, 54326);


        int minInterval = 12345;
        int maxInterval = 42345;


        printDiapazonCard(customers, minInterval, maxInterval);
        sortByAlphavit(customers);

    }

    public static void printDiapazonCard(Customer[] customers, int minInterval, int maxInterval) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getCreditCard() >= minInterval && customers[i].getCreditCard() <= maxInterval) {
                System.out.println(customers[i].getSurname() + " " + customers[i].getCreditCard());
            }
        }
    }

    public static void sortByAlphavit(Customer[] customers) {
        Arrays.sort(customers, new ComparatorBySurname());
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].getSurname());
        }
    }
}


