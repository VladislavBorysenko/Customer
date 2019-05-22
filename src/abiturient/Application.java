package abiturient;

import abiturient.utils.ComparatorByRating;

import java.util.Arrays;

public class Application {

    public static final int ENTERING_SCORE = 70;
    public static final int NOMBER_OF_STUENTS = 2;


    public static void main(String[] args) {

        Abiturient[] abiturients = new Abiturient[12];
        abiturients = createArray();

        Arrays.sort(abiturients, new ComparatorByRating());

        listOfMinExelentStudents(abiturients, NOMBER_OF_STUENTS);

        listOfExelentStudents(abiturients, ENTERING_SCORE);

        listOfBadResoultAbiturients(abiturients, ENTERING_SCORE);

    }

    private static Abiturient[] createArray() {
        Abiturient[] abiturients = new Abiturient[12];
        abiturients[0] = new Abiturient(1, "Ivan", "Ivanov", "Ivanovich", "Chkalova str.", 12340, 56);
        abiturients[1] = new Abiturient(2, "Petr", "Petrov", "Petrovich", "Bonanisheskaya str.", 12341, 78);
        abiturients[2] = new Abiturient(3, "Semen", "Semenov", "Semenovich", "Naukova aveny.", 12342, 95);
        abiturients[3] = new Abiturient(4, "Maxim", "Maximov", "Maximovich", "Peremoga str.", 12343, 12);
        abiturients[4] = new Abiturient(5, "Anton", "Antonov", "Antonovich", "VLKSM str.", 12344, 30);
        abiturients[5] = new Abiturient(6, "Anatoliy", "Anatoliev", "Anatolievich", "Druzhbi str.", 12345, 47);
        abiturients[6] = new Abiturient(7, "Ivanich", "Ivanovch", "Ivanovich", "Chkalova str.", 12346, 56);
        abiturients[7] = new Abiturient(8, "Petr", "Petrovov", "Petrovich", "Bonanisheskaya str.", 12347, 78);
        abiturients[8] = new Abiturient(9, "Semen", "Semerenko", "Semenovich", "Naukova aveny.", 12348, 90);
        abiturients[9] = new Abiturient(10, "Maxim", "Maximoff", "Maximovich", "Peremoga str.", 12349, 50);
        abiturients[10] = new Abiturient(11, "Anton", "Antonovenko", "Antonovich", "VLKSM str.", 12350, 60);
        abiturients[11] = new Abiturient(12, "Anatoliy", "Aksenov", "Anatolievich", "Druzhbi str.", 12351, 77);

//        for (int i = 0; i < abiturients.length; i++) {
//            System.out.println(abiturients[i]);
//        }
        return abiturients;
    }

    public static void listOfBadResoultAbiturients(Abiturient[] abiturients, int enteringScore) {
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getRating() < enteringScore) {

                System.out.println("List of abiturients with bad resoult " + abiturients[i].getName() + " " + abiturients[i].getSurname() + " " + abiturients[i].getRating());
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }

    public static void listOfExelentStudents(Abiturient[] abiturients, int enteringScore) {
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getRating() > enteringScore)
                System.out.println("List of exelent resoult " + abiturients[i].getName() + " " + abiturients[i].getSurname() + " " + abiturients[i].getRating());
        }


    }

    public static void listOfMinExelentStudents(Abiturient[] abiturients, int numberofStuents) {

        for (int i = 0; i < abiturients.length; i++) {
            System.out.println(abiturients[i]);
        }

        System.out.println("Print " + numberofStuents + " students with best rating:");
        for (int i = 0; i < numberofStuents; i++) {
            System.out.println(abiturients[i]);
        }
        System.out.println("____________________________________________");
    }


}

