package method_or_function;

import java.util.Scanner;

public class SimpleInterest {

    static float P, R, T, SI;

    public static void main(String[] args) {


        System.out.println("CALCULATE THE SIMPLE INTEREST");

        Scanner obj = new Scanner(System.in);
        int n = 5;
        while (n != 0) {
            System.out.println("enter the value of P");
            P = obj.nextInt();
            System.out.println("enter the value of R");
            R = obj.nextInt();
            System.out.println("enter the value of T");
            T = obj.nextInt();

            SI = (P * R * T) / 100;

            System.out.println("After calculating SI is:  " + SI);
            n--;


        }
    }
}


