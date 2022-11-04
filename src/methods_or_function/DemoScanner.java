package methods_or_function;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        //CREATE OBJECT OF SCANNER CLASS

        Scanner scanner= new Scanner(System.in);

        // Reading String input

        System.out.println("Please enter your name : ");

        String name= scanner.nextLine();// it reads string input

        System.out.println("You have entered name as : "+name);

        // reading integer data
        System.out.println("Please enter any number : ");
        int number = scanner.nextInt();// reads integer data
        System.out.println("You have entered number as  :"+number);

        // Reading Decimal data
        System.out.println("Please enter your salary: ");
        double salary=scanner.nextDouble();// reads decimal values

        System.out.println("you have entered salary as :"+salary);


    }
}
