package exception_demo;

import java.util.Scanner;

public class VotingApplication {

    public void doVote(int age) throws AgeNotEligibleException {

        if(age<18){

            throw new AgeNotEligibleException("Voter age is less than 18 so not eligible");
        }
        else {

            System.out.println("Welcome to voting app please do voting .....");
        }
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Voting App, please enter your age");
        int age= scanner.nextInt();

        VotingApplication obj= new VotingApplication();
        try {
            obj.doVote(age);
        } catch (AgeNotEligibleException e) {
            e.printStackTrace();
        }

    }
}
