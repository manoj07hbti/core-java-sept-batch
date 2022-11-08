package Package_8_methods;

import java.util.Scanner;

public class User_input_continue_calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        return (double) a / b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User_input_calculator obj = new User_input_calculator();
        int counter = 0;
        int result = 0;
        int a = 0, b = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Please Choose 1 operation, " + "\n" + "1: addition" + "\n" + "2: subtraction" + "\n" + "3: multiplication" + "\n" + "4: division" + "\n" + "5: exit");
            int option = sc.nextInt();

            if (option <= 4) {
                if (counter == 0) {
                    System.out.println("Please enter number 1:");
                    a = sc.nextInt();
                    System.out.println("Please enter number 2:");
                    b = sc.nextInt();
                }
                if (counter > 0) {
                    a = result;
                    System.out.println("Please enter next number:");
                    b = sc.nextInt();
                }
                switch (option) {

                    case 1:
                        System.out.println("addition of given numbers is: " + obj.add(a, b));
                        result = obj.add(a, b);
                        counter++;
                        break;
                    case 2:
                        System.out.println("subtraction of given numbers is: " + obj.sub(a, b));
                        result = obj.sub(a, b);
                        counter++;
                        break;
                    case 3:
                        System.out.println("multiplication of given numbers is: " + obj.multi(a, b));
                        result = obj.multi(a, b);
                        counter++;
                        break;
                    case 4:
                        System.out.println("division of given numbers is: " + obj.div(a, b));
                        result = (int) obj.div(a, b);
                        counter++;
                        break;
                }
            } else if (option == 5) {
                System.out.println("Thank you for using my Calculator");
                flag = false;
            } else {
                System.out.println("please enter valid input");
            }
        }
    }
}