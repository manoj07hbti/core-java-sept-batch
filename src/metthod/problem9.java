package metthod;

import java.util.Scanner;

public class problem9 {

    //Todo =checkEligibility
    public static void main(String[]args) {
        int age;
        int diff;
        // taking use input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age:");
       age=scanner.nextInt();
        // checking condition of voting
        if (age>=18){
            System.out.println("you are the eligible for voting");

        }
        else {
            System.out.println("sorry,you are not eligible for voting.");


        }
        diff=18-age;
        System.out.println("yor are not eligible vote"+diff+"year");



    }




    }


