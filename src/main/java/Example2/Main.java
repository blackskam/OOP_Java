package Example2;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите арифметическую операцию через пробел:");
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        for (String retval : input.split(" ", 50)) {
            list.add(retval);
        }
        Calc.arithmetic(list.get(0), list.get(1), list.get(2));
    }
}
