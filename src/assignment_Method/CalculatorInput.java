package assignment_Method;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorInput {
    public static void main(String[] args) {

        //Create Object of Scanner Class

        Scanner scanner = new Scanner(System.in);

        //Reading String Input
        System.out.println("Please Enter Your Name : ");

        String name = scanner.nextLine();
        System.out.println("You have entered your name as : " +name );

        //Reading Integer data

        System.out.println("Please Enter Integer value : ");

        int number = scanner.nextInt();   //reads integer value
        System.out.println("You have entered number as : " +number);


        //Reading Decimal

        System.out.println("Please Enter Your Salary Amount : ");
        double salary = scanner.nextDouble();
        System.out.println("You have enter your salary amount is :  " +salary);
    }
}
