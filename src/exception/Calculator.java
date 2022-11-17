package exception;

public class Calculator {

    public double divide(int a, int b) {


        System.out.println("DIVISION");
        int divide = 0;
        try {

            divide = a / b;
        } catch (Exception e) {

            System.out.println("Exception " + e);
        }


        System.out.println("AFTER DIVIDE");

        return divide;

    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        double result = obj.divide(20, 0);

        System.out.println("PRINTING RESULT : " + result);

    }
}
