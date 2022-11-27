package Practice_Set;

import java.util.Scanner;

public class banking {




    public static void main(String[] args) {
        int balance = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the your name");
        String name = Sc.nextLine();
        System.out.println("welcome " + name);
        System.out.println("Enter the account number:");
        int acc = Sc.nextInt();
        int bank = 1;
        while (bank == 1) {
            System.out.println("1 Axis Bank");
            System.out.println("2 ICIC Bank");
            System.out.println("3 SBI Bank");
            System.out.println("4 Indian Bank");
            int bak = Sc.nextInt();
            switch (bak) {
                case 1:
                    System.out.println("welcome to Axis Bank");
                    break;
                case 2:
                    System.out.println("welcome to ICIC Bank");
                    break;
                case 3:
                    System.out.println("welcome to Sbi Bank");
                    break;
                case 4:
                    System.out.println("welcome to Indian Bank");
                    break;
            }
            break;
        }
        int a = 1;
        while (a == 1) {
            System.out.println("1 deposit");
            System.out.println("2 withdraw");
            System.out.println("3 check balance");
            System.out.println("4 Exit");
            System.out.println("enter the choice");
            int ch = Sc.nextInt();
            if (ch == 1) {
                System.out.println("enter the amount of deposit");
                int deposit = Sc.nextInt();
                System.out.println("your amount deposit Successfully");
            } else if (ch == 2) {
                System.out.println("Enter amount of withdraw");
                int withdraw = Sc.nextInt();
                if (withdraw > balance) {
                    System.out.println("withdraw failure,pleas check your amount ");
                } else {
                    balance = balance - withdraw;
                    System.out.println("withdraw Successfully");

                }

            }
            else if (ch==3){
                System.out.println("your balance is "+balance);
            } else if (ch==4) {
                System.out.println("`thank you "+ name);
            }
            else
            {

            }


        }
    }
}















