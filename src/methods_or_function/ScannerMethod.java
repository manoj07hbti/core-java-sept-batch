package methods_or_function;

import java.util.Scanner;

public class ScannerMethod {

   public static void main(String args[]){

      Scanner scanner= new Scanner(System.in);
      System.out.println("please enter your Funny name: ");
      String name = scanner.nextLine();
      System.out.println("Your Funny name is: "+name);


      System.out.println("Please Enter Your ATM pin : ");
      String pin = scanner.nextLine();
      System.out.println("Your ATM Pin is: "+pin);

   }




}
