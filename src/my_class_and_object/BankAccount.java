package my_class_and_object;

import java.sql.SQLOutput;

public class BankAccount {
    int acctNo;
    String acctName;
    String branchName;

    public BankAccount(int acctNo, String acctName, String branchName) {
        this.acctNo = acctNo;
        this.acctName = acctName;
        this.branchName = branchName;
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount(01034121,"Gyanendra", "Jhansi");
        System.out.println("Account NO. :"+obj.acctNo + "   Account Name :"+obj.acctName +"    Branch Name :" +obj.branchName);
    }

}
