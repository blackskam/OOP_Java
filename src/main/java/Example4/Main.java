package Example4;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        User Pupkin = new Teacher(2, "Иван", "Пупкин",
                "Олегович", LocalDate.now());
        User Filologov = new Teacher(3, "Петр", "Филологов",
                "Иванович", LocalDate.now());
        User Istorikov = new Teacher(1, "Семен", "Историков",
                "Семенович", LocalDate.now());

        TreeSet ts = new TreeSet(new TeacherComparator());
        ts.add(Pupkin);
        ts.add(Filologov);
        ts.add(Istorikov);

        System.out.println(ts);
    }
}
