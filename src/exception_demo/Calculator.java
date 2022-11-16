package exception_demo;

public class Calculator {


    public int divide(int a, int b) {

        System.out.println(" before divide  ");
        int divide=0;
        try {
             divide = a / b;
        }
        catch (Exception e) {

            System.out.println("Exception occurod " + e);
        }

        System.out.println(" after divide  ");
        return divide;

    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        System.out.println(" after creating object ");

        int result = obj.divide(25, 0);
        System.out.println(" after calling method ");
        System.out.println("Printing divide : " + result);
    }
}
