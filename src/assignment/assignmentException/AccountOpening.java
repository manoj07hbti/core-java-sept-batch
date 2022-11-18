package assignment.assignmentException;

import java.util.Scanner;

public class AccountOpening {

    public void openAccount(double amount) throws OpenAccount {
        if (amount <5000){
            throw new OpenAccount("Amount is less then 5000 rs,Min deposit amount is 5000");
        }
        else {
            System.out.println("Congratulation your account is open");
        }

    }

    public static void main(String[] args) {
        Scanner scanner     = new Scanner(System.in);
        System.out.println("Welcome to HDICI Bank ,Please Enter Amount to deposit");
        double  amount  = scanner.nextInt();

        AccountOpening obj = new AccountOpening();
        try {
            obj.openAccount(amount);
        } catch (OpenAccount e) {
            throw new RuntimeException(e);
        }

    }
}
