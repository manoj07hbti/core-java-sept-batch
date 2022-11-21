package Exception_Program;

import java.util.Scanner;

public class bankDetails {

public void accountOpen(int marks)throws NotDepositMoneyInAccount{

    if(marks>40){
        throw new NotDepositMoneyInAccount("Marks is less than 40% Scholarship is not credit in account");
    }

     else {

         System.out.println("Marks is greater than 40% or equal to 40 then Scholarship will be credited");
    }

}



    public static void main (String args[]){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Welcome to Scholarship Application please enter your marks");

        int marks = scanner.nextInt();

        bankDetails obj = new bankDetails();












    }
}
