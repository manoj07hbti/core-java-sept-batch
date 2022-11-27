package Practice_Set;

import java.util.Scanner;

public class Square_practice {
    // TODO=Take value of length and breadth  of a rectangle form check if it is square or not?

    public static void main(String[]args){
        int length,b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length");
        length=scan.nextInt();

        System.out.println("Enter the Breath");
        b=scan.nextInt();

        if (length==b){
            System.out.println("it is Square");

        }
        else {
            System.out.println("It is not square");
        }



    }




}
