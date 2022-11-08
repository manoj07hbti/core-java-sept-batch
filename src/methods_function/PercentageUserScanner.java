package methods_function;

import java.util.Scanner;

public class PercentageUserScanner {
    // create method

    public double percentageApp(double number, double n ){

        return  (number*n)/100;

    }

    public static void main(String[] args) {
        // Create scanner class

        Scanner obj = new Scanner(System.in);
        System.out.println(" Please enter any number by User  : ");
        double  number = obj.nextInt();
        System.out.println( " You have entered number as : " + number);

        System.out.println(" Please enter any value of n  by User  : ");
        double n = obj.nextInt();
        System.out.println( " You have entered any value of n as  : " + n);


        PercentageUserScanner percentage = new PercentageUserScanner();
       double result =  (double) percentage.percentageApp(number,n);
        System.out.println(result);
    }
}
