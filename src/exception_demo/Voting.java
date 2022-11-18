package exception_demo;

import java.util.Scanner;

public class Voting {

    public void doVote(int age) throws Demo_voting {

        if (age<18){
      throw new Demo_voting("voter age is less than 18 so not eligible");


    }
        else {
            System.out.println("welcome to app");
        }


}
public static void main(String[]args){

    Scanner scanner=new Scanner(System.in);

    System.out.println("welcome the voting the System:");
    int age=scanner.nextInt();

    Voting obj=new Voting();
    try {
        obj.doVote(age);
    } catch (Demo_voting e) {
        throw new RuntimeException(e);
    }


}



    }

