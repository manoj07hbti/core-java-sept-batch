package method_or_function;

import java.util.Scanner;

public class VotingScanner {
    public static void main(String[] args) {
        int age;
        int flag = 1;
        Scanner sc = new Scanner(System.in);
        while (flag == 1) {
            System.out.println("Please Enter Your Age");
            age = sc.nextInt();

            if (age >= 18) {
                System.out.println("You are Elligible for Voting");
            } else {
                System.out.println("You are not Elligible for Voting");
            }
            System.out.println("Press 1 to Enter or Press any key to exit");
            flag = sc.nextInt();
            if (flag!=1){
                System.out.println("Thanks for Voting");
            }
        }
    }
}
