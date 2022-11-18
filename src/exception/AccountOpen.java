package exception;

import java.util.Scanner;

public class AccountOpen {
    public void openAccount( double amount ) throws AmountNotException {

        if(amount<5000){

            throw new AmountNotException(" If Amount  is less than 5000 so account will not open");
        }
        else {

            System.out.println("Welcome to  AccountOpen  app please do open .....");
        }
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to AccountOpen App, please enter your amount");
       double amount = scanner.nextDouble();

       AccountOpen application  = new AccountOpen();
        try {
           application.openAccount( amount);
        } catch (AmountNotException e) {
            e.printStackTrace();
        }

    }

}
