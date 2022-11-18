package exception_demo;

import java.util.Scanner;

public class BankAccountOpen {
    public void accountAmount(double amount) throws AccountOpenException{

        if (amount<5000){

            throw new AccountOpenException("bank can not open account");

        }
        else {
            System.out.println("account open");

        }



    }
    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("account open, Enter amount ");

        BankAccountOpen obj=new BankAccountOpen();
            double amount=scanner.nextInt();
        try {

            obj.accountAmount( amount);

        }
        catch (AccountOpenException e){

            throw new RuntimeException(e);
        }


    }
}

