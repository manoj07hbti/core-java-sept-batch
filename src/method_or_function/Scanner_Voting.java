package method_or_function;

import java.util.Scanner;

public class Scanner_Voting {


    public static void main(String[] args) {

        while (true) {
            System.out.println("CHECKING ELIGIBILITY FOR VOTE");

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your age: ");
            int age = scan.nextInt();

            if (age >= 18) {
                System.out.println("You are eligible for voting.");
            } else {
                System.out.println("Sorry,You can vote after: ");
            }
        }
    }
}

