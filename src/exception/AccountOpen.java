package exception;

import java.util.Scanner;

public class AccountOpen {

    public void accountAmount(double amount) throws AccountOpenException {

        if (amount < 5000) {

            throw new AccountOpenException(" account can not be open ");

        } else {

            System.out.println("Account can be open");
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Account open : ENTER AMOUNT");
        double amount = scanner.nextInt();


        AccountOpen obj = new AccountOpen();

        try {
            obj.accountAmount(amount);
        }
        catch (AccountOpenException e) {

            throw new RuntimeException(e);
        }

    }
}
