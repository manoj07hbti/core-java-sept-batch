package assignment_Method;

import java.util.Scanner;

public class EligibilityScanner {
    public void voter(int age, String location )  {
        if (age >= 18 && location == "Agra"){
             System.out.println("Eligible for voting in Agra ");
        }
        else {
            System.out.println("Not Eligible for voting");

        }
//

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age = scanner.nextInt();
        System.out.println("Please Enter your Location");
        String location = scanner.nextLine();
        EligibilityScanner obj = new EligibilityScanner();
        obj.voter(age,location);

    }
}
