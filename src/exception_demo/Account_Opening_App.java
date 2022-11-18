package exception_demo;

import java.util.Scanner;

public class Account_Opening_App {

    public void Account_opening(double amount) throws Amount_Not_Valid_For_Open_Account {
        if (amount<5000){

            throw new Amount_Not_Valid_For_Open_Account("amount not valid for open account");

        }
        else {

            System.out.println("Welcome to open for account-------");
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to Account opening app , Please enter your Amount");

        double amount=scanner.nextDouble();

        Account_Opening_App obj=new Account_Opening_App();

        try {
            obj.Account_opening(amount);

        }
        catch (Amount_Not_Valid_For_Open_Account e){

            e.printStackTrace();
        }
    }
        }

