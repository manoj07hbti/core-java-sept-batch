package aj_methods;

import java.util.Scanner;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public double div(int a, int b){
        return (double)a/b;
    }
    public static void main(String[] args) {
        Calculator c= new Calculator();
        Scanner sc= new Scanner(System.in);
        int ask=0;
        double result=0;
        do {


            System.out.println("Enter operation wants to perform\n 1- add  2- substract  3- multiplication  4- division");

            int choice = sc.nextInt();
            int num1=0,num2=0;
            if (choice >= 1 && choice <= 4) {

                if(ask==1){
                    num1=(int)result;
                }
                else {
                    System.out.println("Enter first number:");
                    num1 = sc.nextInt();
                }
                System.out.println("Enter second number:");
                num2 = sc.nextInt();
            }
                switch (choice) {
                    case 1:
                        result=c.add(num1, num2);
                        System.out.println("Addition of " + num1 + " and " + num2 + " = " + result );
                        break;
                    case 2:
                        result= c.sub(num1, num2);
                        System.out.println("Substraction of " + num1 + " and " + num2 + " = " +result );
                        break;
                    case 3:
                        result= c.mul(num1, num2);
                        System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + result);
                        break;
                    case 4:
                        result=  c.div(num1, num2);
                        System.out.println("Division of " + num1 + " and " + num2 + " = " +result);
                        break;
                    default:
                        System.out.println("Please enter valid operation");
                }
            System.out.println("Do you want to continue: Press 1");
            ask= sc.nextInt();
        }
     while (ask==1);
    }
}
