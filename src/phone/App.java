package phone;

import phone.utils.ComparaorBySurname;

import java.util.Arrays;

public class App {
    private static final int INNER_TIME = 60;

    public static void main(String[] args) {
        Abonent[] abonents = new Abonent[12];
        abonents = createArray();
        listOfMaxTimeAbonent(abonents, INNER_TIME);
        listOfAutCollAbonent(abonents);
        sortByAlphavit(abonents);
    }

    private static Abonent[] createArray() {
        System.out.println("Method: createArray" + '\n');

        Abonent[] abonents = new Abonent[12];
        abonents[0] = new Abonent(1, "Abonent_1", "B_Surname Abonent_1", "Fathername Abonent_1", "Chkalova str.", 123450, 50, 60, 26, 15);
        abonents[1] = new Abonent(2, "Abonent_2", "E_Surname Abonent_2", "Fathername Abonent_2", "Naukova aveny.", 123451, 50, 75, 60, 45);
        abonents[2] = new Abonent(3, "Abonent_3", "T_Surname Abonent_3", "Fathername Abonent_3", "Peremoga str.", 123452, 100, 120, 40, 0);
        abonents[3] = new Abonent(4, "Abonent_4", "J_Surname Abonent_4", "Fathername Abonent_4", "Druzhbi str.", 123453, 75, 15, 80, 55);
        abonents[4] = new Abonent(5, "Abonent_5", "A_Surname Abonent_5", "Fathername Abonent_51", "Chkalova str.", 123454, 50, 41, 25, 0);
        abonents[5] = new Abonent(6, "Abonent_6", "S_Surname Abonent_6", "Fathername Abonent_6", "Naukova aveny.", 123456, 100, 35, 75, 60);
        abonents[6] = new Abonent(7, "Abonent_7", "Q_Surname Abonent_7", "Fathername Abonent_7", "Peremoga str.", 123457, 75, 40, 41, 55);
        abonents[7] = new Abonent(8, "Abonent_8", "W_Surname Abonent_8", "Fathername Abonent_8", "Chkalova str.", 123458, 100, 50, 45, 0);
        abonents[8] = new Abonent(9, "Abonent_9", "E_Surname Abonent_9", "Fathername Abonent_9", "Peremoga str.", 123459, 100, 120, 40, 85);
        abonents[9] = new Abonent(10, "Abonent_10", "R_Surname Abonent_10", "Fathername Abonent_10", "Naukova aveny.", 123460, 75, 35, 55, 60);
        abonents[10] = new Abonent(11, "Abonent_11", "W_Surname Abonent_11", "Fathername Abonent_11", "Chkalova str.", 123461, 75, 20, 50, 75);
        abonents[11] = new Abonent(12, "Abonent_12", "U_Surname Abonent_12", "Fathername Abonent_12", "Druzhbi str.", 123462, 100, 101, 40, 0);
        return abonents;
    }

    private static void listOfMaxTimeAbonent(Abonent[] abonents, int innerTime) {
        System.out.println("Method : listOfMaxTimeAbonent");
        for (int i = 0; i < abonents.length; i++) {
            if (abonents[i].getInnerTime() >= innerTime) {
                System.out.println(abonents[i]);
            }

        }
    }

    private static void listOfAutCollAbonent(Abonent[] abonents) {
        System.out.println("Method: listOfOutCollAbonent");
        for (int i = 0; i < abonents.length; i++) {
            if (abonents[i].getOuterTime() > 0) {
                System.out.println(abonents[i]);
            }
        }
    }

    private static void sortByAlphavit(Abonent[] abonents) {
        System.out.println("Method : sortByAlphavit");
        Arrays.sort(abonents, new ComparaorBySurname());
        for (int i = 0; i <abonents.length ; i++) {
            System.out.println(abonents[i]);

        }
    }

}
