package exception;

import java.util.Scanner;

public class VotingApplication {

    public void doVote(int age) throws AgeNotEligibleException {

        if(age<18){

            throw new AgeNotEligibleException("it is not eligible");

        }
        else {

            System.out.println("it is eligible");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("VOTING APPLICATION");

        int age = scanner.nextInt();

        VotingApplication obj = new VotingApplication();
        try {
            obj.doVote(age);
        } catch (AgeNotEligibleException e) {
            throw new RuntimeException(e);
        }

    }
}
