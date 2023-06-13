package Example2;

public class Calc {


    public static void arithmetic(String firstString, String arithmetic, String secondString) {
        double first = 0;
        double second = 0;
        double result =0;


        first = Double.parseDouble(firstString);
        second = Double.parseDouble(secondString);

        Operation operation;
        if (arithmetic.equals("-")) {
            operation = new Subtraction();
            result = operation.invoke(first, second);
        }
        if (arithmetic.equals("*")){
            operation = new Multiplication();
            result = operation.invoke(first, second);
        }
        if (arithmetic.equals("/")){
            operation = new Division();
            result = operation.invoke(first, second);
        }
        if (arithmetic.equals("+")){
            operation = new Addition();
            result = operation.invoke(first, second);
        }
        System.out.println(result);
    }
}
