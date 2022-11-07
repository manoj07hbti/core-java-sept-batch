package Methods;

import java.util.Scanner;

public class CalciMe {
    int a;
    int b;

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        int result;
        int choice;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b");
        int b = sc.nextInt();
        CalciMe cm = new CalciMe();
        System.out.println("Enter the");
        choice = sc.nextInt();
        int var ;

        do {

            switch (choice) {
                case 1:
                    result = cm.addition(a, b);
                    System.out.println("Addition is :" + result);
                    break;
                case 2:
                    result = cm.subtraction(a, b);
                    System.out.println("subtraction is :" + result);
                    break;
                case 3:
                    result = cm.multiplication(a, b);
                    System.out.println("multiplication is :" + result);
                    break;
                case 4:
                    double div = (double) cm.division(a, b);
                    System.out.println("division is :" + div);
                    break;
                default:
                    System.out.println("Invalid choice by user");

            }
            var= sc.nextInt();
            System.out.println( "You want to entered   :" +var);
        }
        while (var != 1 ) ;
    }
}