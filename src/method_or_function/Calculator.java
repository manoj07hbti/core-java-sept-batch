package method_or_function;

public class Calculator {

    public void add() {
        int a = 21;
        int b = 24;
        int sum = a + b;

        System.out.println(" Sum is : " +sum);
    }

    public void sum() {
        int a = 21;
        int b = 12;
        int sub = a - b;

        System.out.println(" Subtract is : " + sub);
    }

    public void multiple() {
        int a = 21;
        int b = 3;
        int multiple = a * b;

        System.out.println(" Multiple is : " + multiple);
    }

    public void divide() {
        int a = 25;
        int b = 5;
        int div = a / b;

        System.out.println(" Divide is : " + div);
    }
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        calculator.add();
        calculator.sum();
        calculator.multiple();
        calculator.divide();
    }
}
