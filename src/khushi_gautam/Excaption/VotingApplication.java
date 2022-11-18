package khushi_gautam.Excaption;

import java.util.Scanner;

public class VotingApplication {
    public void doVote(int age) throws AgeNotEligibleException{
        if (age<18){
            throw new AgeNotEligibleException("Voter is less than 18 so not eligible for vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to voting app");
        int age = sc.nextInt();
        VotingApplication obj = new VotingApplication();
        try {
            obj.doVote(age);
        }
        catch (AgeNotEligibleException e){
            e.printStackTrace();
        }
    }
}
