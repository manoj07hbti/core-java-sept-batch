package khushi_gautam.Excaption;

import java.util.Scanner;

public class paymentApplication {
    public void makePayment(int amount) throws AccountOpen {
        if (amount<5000){
            throw new AccountOpen("Sorry this amount is less than fixed amount");
        }
        else {
            System.out.println("Make your payment withdraw");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to make payment");
        int amount= sc.nextInt();
        paymentApplication obj= new paymentApplication();
        try {
            obj.makePayment(amount);
        }
        catch (AccountOpen pay){
            pay.fillInStackTrace();
        }
    }
}
