package Books.utility;

import Books.Books;

import java.util.Comparator;

public class ComparatorByYear implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Books) o2).getYear() - ((Books) o1).getYear();
    }
}
