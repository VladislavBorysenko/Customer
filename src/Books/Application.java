package Books;

import Books.utility.ComparatorByYear;

import java.util.Arrays;

public class Application {
    public static final String AUTHOR = "Semen";
    public static final String REDACTOR = "Maximovich";
    public static final int YEAR=1990;

    public static void main(String[] args) {
        Books[] books = new Books[12];
        books = createArray();
        //listOfAuthor(books, AUTHOR);
        //listOfRedactor(books, REDACTOR);
        Arrays.sort(books, new ComparatorByYear());
        listOfLastYearBook(books,YEAR);
    }


    private static Books[] createArray() {
        Books[] books = new Books[12];
        books[0] = new Books("Ivan", "Semen", "Ivanovich", 1990, 10, 56, "soft");
        books[1] = new Books("Petr", "Petrov", "Petrovich", 1992, 12, 78, "hard");
        books[2] = new Books("Semen", "Semenov", "Semenovich", 1989, 11, 95, "soft");
        books[3] = new Books("Maxim", "Semen", "Maximovich", 1958, 10, 12, "hard");
        books[4] = new Books("Anton", "Antonov", "Antonovich", 1965, 15, 30, "soft");
        books[5] = new Books("Anatoliy", "Anatoliev", "Maximovich", 1958, 20, 47, "hard");
        books[6] = new Books("Ivanich", "Ivanovch", "Ivanovich", 1965, 50, 56, "soft");
        books[7] = new Books("Petr", "Petrovov", "Petrovich", 1989, 45, 78, "hard");
        books[8] = new Books("Semen", "Semen", "Semenovich", 1992, 35, 90, "soft");
        books[9] = new Books("Maxim", "Maximoff", "Maximovich", 1990, 30, 50, "hard");
        books[10] = new Books("Anton", "Antonovenko", "Antonovich", 1991, 40, 60, "soft");
        books[11] = new Books("Anatoliy", "Aksenov", "Maximovich", 1991, 42, 77, "hard");
        return books;
    }

    public static void listOfLastYearBook(Books[] books,int year ){
        for (int i = 0; i <books.length ; i++) {
            if (books[i].getYear()>year)
                System.out.println(books[i].getName()+" "+books[i].getYear());

        }
    }

    public static void listOfAuthor(Books[] books, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {

                System.out.println(books[i].getName());
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }

    public static void listOfRedactor(Books[] books, String redactor) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getRedactor().equals(redactor)) {
                System.out.println(books[i].getName() + " " + books[i].getRedactor());
            }
        }
    }
}
