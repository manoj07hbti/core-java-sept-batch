package Package_8_methods;

import java.util.Scanner;

public class User_input_calculator {
public int add(int a, int b){
    return a+b;
}
public int sub(int a, int b){
    return a-b;
}
public int multi(int a, int b){
    return a*b;
}
public double div(int a, int b){
    return (double)a/b;
}

    public static void main(String[] args) {
    boolean x = true;
            while (x) {
                Scanner sc = new Scanner(System.in);
                User_input_calculator obj = new User_input_calculator();
                boolean b1;
                System.out.println("Please Choose 1 operation, " + "\n" + "1: addition" + "\n" + "2: subtraction" + "\n" + "3: multiplication" + "\n" + "4: division");
                int option = sc.nextInt();
                if (option<=4) {
                    System.out.println("Please enter number 1:");
                    int a = sc.nextInt();
                    System.out.println("Please enter number 2:");
                    int b = sc.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("addition of given numbers is: " + obj.add(a, b));
                            break;
                        case 2:
                            System.out.println("subtraction of given numbers is: " + obj.sub(a, b));
                            break;
                        case 3:
                            System.out.println("multiplication of given numbers is: " + obj.multi(a, b));
                            break;
                        case 4:
                            System.out.println("division of given numbers is: " + obj.div(a, b));
                            break;
                    }
                    System.out.println("please choose 1 option" + "\n" + "1: try again with different inputs" + "\n" + "2: exit");
                    int option2 = sc.nextInt();
                    switch (option2) {
                        case 1:
                            System.out.println("restarting the program...");
                            break;
                        case 2:
                            x = false;
                            System.out.println("Thank you for using this calculator");
                    }
                }
                else {
                    System.out.println("enter valid input and try again");
                }
            }
    }
}
