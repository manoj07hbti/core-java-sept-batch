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
        int a;
        int b;

        int var =1 ;
        CalciMe cm = new CalciMe();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Value of a");
            a = sc.nextInt();
            System.out.println("Enter the Value of b");
            b = sc.nextInt();
            System.out.println("Enter The Operation You Perform 1:Add 2:Subtract 3:Multiply 4:Divide");
            choice = sc.nextInt();
            System.out.println("Enter The Operation You Perform " +choice);
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
            System.out.println( "If You want to entered Again Press: 1 Else for Exit Press any key :");
            var= sc.nextInt();
            System.out.println( "You Press   :" +var);
        }
        while (var== 1 ) ;
    }
}