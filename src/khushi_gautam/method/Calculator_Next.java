package khushi_gautam.method;

import java.util.Scanner;

public class Calculator_Next {
    char operator;
    int a, b;
    public int add(int a, int b) {return a + b;}
    public int sub(int a, int b) {return a - b;}
    public int multiply(int a, int b) {return a * b;}
    public int divide(int a, int b) {return a / b;}

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator app");

        System.out.println("please enter value of A");
        int a = Sc.nextInt();
        System.out.println("please enter value of B");
        int b = Sc.nextInt();
        System.out.println("choose an operator:+, -, *, /");
        char operator = Sc.next().charAt(0);
        Calculator_Next obj = new Calculator_Next();
        switch (operator) {
            case '+':
                int result = obj.add(a, b);
                System.out.println(result);
                break;
            case '-':
                int result1 = obj.sub(a, b);
                System.out.println(result1);
            case '*':
                int result2 = obj.multiply(a, b);
                System.out.println(result2);
                break;
            case '/':
                int result3 = obj.divide(a, b);
                System.out.println(result3);
            default:
                System.out.println("Please enter the right operator");
        }
    }
}
