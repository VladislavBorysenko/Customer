package abiturient.utils;

import abiturient.Abiturient;

import java.util.Comparator;


public class ComparatorByRating implements Comparator {

    public int compare(Object o1, Object o2) {
        return ((Abiturient) o2).getRating() - ((Abiturient) o1).getRating();
    }
}

