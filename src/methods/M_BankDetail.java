package methods;

import java.util.Scanner;

public class M_BankDetail {
    String accname;
    String addr;
    int balance;
    long mobNo;

    Scanner sa = new Scanner(System.in);


    public void openAccount(){
        System.out.println("Type Of Account: Saving Acct or Current Acct");
        String accname = sa.nextLine();
       if(accname.contains("Saving account")){
           System.out.println("You are eligible for Saving Acct");
       }
        else
           System.out.println("You are not eligible for Saving Acct");
    }

    public void closeAccount(){
        System.out.println("Enter the Balance of  Account: ");
        int balance = sa.nextInt();
        if(balance< 500){
            System.out.println("Account Closed :You have insufficient balance");
        }
        else
            System.out.println("Account NOt Closed :You have sufficient balance");

    }

    public void updateAddress(){
        String addr = sa.nextLine();
        System.out.println("Update Address :" +addr);
    }

    public void updateMobileNumber(){
       long balance = sa.nextLong();
        System.out.println("Update Mobile Number :" +mobNo);
    }

    public static void main(String[] args) {
        M_BankDetail mb = new M_BankDetail();
        mb.openAccount();
        mb.closeAccount();
        mb.updateAddress();
        mb.updateMobileNumber();
    }
}
