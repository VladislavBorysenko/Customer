package phone.utils;

import phone.Abonent;

import java.util.Comparator;

public class ComparaorBySurname implements Comparator {

    public int compare(Object o1, Object o2) {
        return ((Abonent) o1).getSurname().compareTo(((Abonent) o2).getSurname());
    }

}
