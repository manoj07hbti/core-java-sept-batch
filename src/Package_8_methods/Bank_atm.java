package Package_8_methods;

import java.util.Scanner;

public class Bank_atm {
   public int bal() {
       return 15000;
   }
    public boolean pinCheck(int pin) {
        if (pin == 1234) {
            return true;
        } else {
            return false;
        }
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
        System.out.println("Welcome to XYZ bank ATM" + "\n" + "Please enter pin");
        int pin = sc.nextInt();
        if (obj.pinCheck(pin)) {
            boolean check = true;
            while(check) {
                System.out.println("Please choose one option" + "\n" + "1: cash withdraw" + "\n" + "2: balance check");
                int option2 = sc.nextInt();
                if (option2 == 1) {
                    System.out.println("Please enter amount");
                    int money = sc.nextInt();
                    obj.withdraw();
                    bal=bal-money;
                }
                else if (option2 == 2) {
                    String bal2 = obj.checkBal();
                    System.out.println(bal2 + bal);
                }
                else {
                    System.out.println("please enter valid input");
                }
                System.out.println("Please choose one option" + "\n" + "press 1 for continue" + "\n" + "press 2 for exit");
                int option3 = sc.nextInt();
                if (option3 == 2) {
                    System.out.println("thank you for using atm");
                check = false;
                }
            }
        }
        else {
            System.out.println("incorrect pin: please remove your card and try again");
        }
    }
}
