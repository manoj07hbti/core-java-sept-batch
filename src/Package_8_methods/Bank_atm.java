package Package_8_methods;

import java.util.Scanner;

public class Bank_atm {
   public int bal() {
       return 15000;
   }
    public boolean pinCheck(int pin) {
        return pin == 1234;
    }
    public String checkBal() {
     // int  bal = 15000;
        return "your account balance is : " ;
    }
    public void withdraw(){
        System.out.println("your transaction is being proceeded");
        System.out.println("Collect your cash");
    }

    public static void main(String[] args) {
        Bank_atm obj = new Bank_atm();
        int bal = obj.bal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to State bank of India bank ATM" + "\n" + "Please enter 4 digit pin");
        int pin = sc.nextInt();
        if (obj.pinCheck(pin)) {
            boolean check = true;
            while(check) {
                System.out.println("Please choose one option" + "\n" + "1: cash withdraw" + "\n" + "2: balance check" + "\n" +"3: Change pin");
                int option2 = sc.nextInt();
                if (option2 == 1) {
                    System.out.println("Please enter amount");
                    int money = sc.nextInt();
                    if (money<bal) {
                        obj.withdraw();
                        bal = bal - money;
                    }
                    else{
                        System.out.println("You don't have sufficient acc. balance to process this request");
                    }
                }
                else if (option2 == 2) {
                    String bal2 = obj.checkBal();
                    System.out.println(bal2 + bal);
                }
                else if (option2 == 3) {
                    System.out.println("Please enter a new 4 digit pin");
                    int newPin = sc.nextInt();
                    System.out.println("A 6 digit otp has been sent to your registered mobile number"+"\n"+"please enter 6 digit otp");
                    int otp = sc.nextInt();
                    System.out.println("Your Pin has been changed successfully");
                }
                else {
                    System.out.println("please enter valid input");
                }
                while(check) {
                    System.out.println("Please choose one option" + "\n" + "press 1 for continue" + "\n" + "press 2 for exit");
                    int option3 = sc.nextInt();
                    if (option3 == 2) {
                        System.out.println("thank you for using atm");
                        check = false;

                    }
                    else if (option3 == 1) {
                       break;
                    }
                     else if (option3 > 2) {
                        System.out.println("please enter valid input");
                    }
                }
            }
        }
        else {
            System.out.println("incorrect pin: please remove your card and try again");
        }
    }
}
