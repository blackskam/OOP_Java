package org.example;
import java.util.Comparator;

public class HotDrinkComparator implements Comparator<HotDrink>{
    @Override
    public int compare(HotDrink o1, HotDrink o2) {
        int resultOfComparing = o1.getPrice().compareTo(o2.getPrice())
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getPrice().compareTo(o2.getPrice());
        }
        return resultOfComparing;

    }
}

