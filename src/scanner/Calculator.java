package scanner;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {

        return a + b;
    }

    public int sub(int a, int b) {

        return a - b;
    }

    public int multi(int a, int b) {

        return a * b;
    }

    public double divide(int a, int b) {

        return (double) a / b;
    }


    public static void main(String[] args) {

        int flag = 1;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        while (flag == 1) {

            System.out.println("Welcome to Calculator Application: Please enter your choice 1: Addition, 2: Subtraction 3:Multiply and 4:Divide");
            int choice = sc.nextInt();

            Calculator cal = new Calculator();
            int a = 0;
            int b = 0;
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                System.out.println("Please enter value of a :");
                a = sc.nextInt();

                System.out.println("Please enter value of b :");
                b = sc.nextInt();
            }


            if (choice == 1) {
                System.out.println(result + "+" + "a:" + a + " b: " + b);
                result += cal.add(a, b); // result= result+obj.add
                System.out.println("Addition is: " + result);
            } else if (choice == 2) {
                result = cal.sub(a, b);
                System.out.println("Subtraction  is: " + result);
            } else if (choice == 3) {
                result = cal.multi(a, b);
                System.out.println("Multiply is: " + result);

            } else if (choice == 4) {

                double output = cal.divide(a, b);
                System.out.println("Division  is: " + output);
            } else {

                System.out.println("Invalid choice ");
            }


            System.out.println("Press 1 to continue or any other number to EXIT");

            flag = sc.nextInt();


        }
    }
}
