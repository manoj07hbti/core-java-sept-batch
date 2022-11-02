package method_or_function;

public class Calculator {

    public void addition(){

        System.out.println("This is addition method");
        int a=20;
        int b=30;
        int sum=a+b;

        System.out.println("Sum is :  "+sum);
    }

    public void subtraction() {

        System.out.println("This is subtraction method");
        int a = 50;
        int b = 30;
        int sub = a - b;

        System.out.println("Sub is :  " + sub);
    }

    public void multiply() {

        System.out.println("This is multiply method");
        int a = 20;
        int b = 30;
        int mul = a * b;

        System.out.println("Mul is:   " + mul);
    }

    public void division() {

        System.out.println("This is division method");
        int a = 60;
        int b = 30;
        int div = a / b;

        System.out.println("Sum is:   " + div);
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        obj.addition();
        obj.subtraction();
        obj.multiply();
        obj.division();
    }

    }
