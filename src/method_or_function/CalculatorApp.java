package method_or_function;

import java.util.Scanner;

public class CalculatorApp {
    static double result;

    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);
        System.out.println("WELCOME IN CALCULATOR APP");

        while (true) {


            System.out.println("please enter the choice:  1:addition, 2:subtraction, 3:multiply, 4: division");
            int choice = obj.nextInt();

            if(choice==5)
                System.exit(2);

            if(choice>=1 && choice<=5) {

                System.out.println("enter the value of num1");
                int num1 = obj.nextInt();

                System.out.println("enter the value of num2");
                int num2 = obj.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("addition of numbers");
                        result = num1 + num2;
                        System.out.println("addition of two numbers: " + result);
                        break;

                    case 2:
                        System.out.println("subtraction of numbers");
                        result = num1 - num2;
                        System.out.println("subtraction of two numbers: " + result);
                        break;

                    case 3:
                        System.out.println("multiply the numbers");
                        result = num1 * num2;
                        System.out.println("multiplication of two numbers: " + result);
                        break;

                    case 4:
                        System.out.println("divide the numbers");
                        result = num1 / num2;
                        System.out.println("division of numbers: " + result);
                        break;

                    default:
                        System.out.println("Invalid operator!");
                        break;

                }
            }

            else{

                System.out.println("INVALID INPUT");
            }


        }
    }
}
