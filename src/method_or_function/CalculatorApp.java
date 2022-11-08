package method_or_function;

import java.util.Scanner;

public class CalculatorApp {
    public int Addition(int a, int b) {
        return a + b;
    }

    public int Substraction(int a, int b) {
        return a - b;
    }

    public int Multiplication(int a, int b) {
        return a * b;
    }

    public double Division(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        int flag = 1;
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        while (flag == 1) {
            System.out.println("Please enter your choice 1 for Addition, 2 for Substraction, 3 for Multiplication, 4 for Division ");
            int choice = scanner.nextInt();

            CalculatorApp obj = new CalculatorApp();
            int a = 0;
            int b = 0;
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                System.out.println("Please enter the value of a:");
                a = scanner.nextInt();

                System.out.println("Please enter the value of b:");
                b = scanner.nextInt();


                if (choice == 1) {
                    result = obj.Addition(a, b);
                    System.out.println("Addition is: " + result);
                } else if (choice == 2) {
                    result = obj.Substraction(a, b);
                    System.out.println("Substraction is: " + result);
                } else if (choice == 3) {
                    result = obj.Multiplication(a, b);
                    System.out.println("Substraction is: ");
                } else if (choice == 4) {
                    double output = obj.Division(a, b);
                    System.out.println("Division is: " + output);
                } else {
                    System.out.println("Invalid choice please enter valid choice");
                }
            }
            System.out.println("Press 1 to continue or any other number to EXIT");
            flag = scanner.nextInt();
        }
    }
}
