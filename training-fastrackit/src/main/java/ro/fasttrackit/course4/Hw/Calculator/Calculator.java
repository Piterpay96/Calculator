package ro.fasttrackit.course4.Hw.Calculator;

public class Calculator {

    static double doOperation(int operator1, int operator2 , String operationType) {
        int result = 0;
        switch (operationType) {
            case "+":
                return operator1 + operator2;
            case "-":
                return operator1 - operator2;
            case "*":
                return operator1 * operator2;
            case "/":
                return operator1 / operator2;
            default:
                return 0.0d;
        }

    }


    public static void main(String[] args) {
        double result= doOperation( 5, 3, "+");
        System.out.println(result);

    }

}
