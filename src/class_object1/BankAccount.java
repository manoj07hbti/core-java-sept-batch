package class_object1;

public class BankAccount {

    //Todo : properties

    String bankName;
    String accountHolderName;
    String bankBranch;
    int branchPinCode;
    int totalBankEmployees;

    // Todo :  Parameter Constructor
    public BankAccount(String bankName, String accountHolderName, String bankBranch, int branchPinCode, int totalBankEmployees) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.bankBranch = bankBranch;
        this.branchPinCode = branchPinCode;
        this.totalBankEmployees = totalBankEmployees;
    }

    // main method
    public static void main(String[] args) {

//  create object by the constructor method
// Todo Syntax :ClassName objectName = new ClassName ( Parameter1,parameter2,parameter3,......);
        BankAccount bank = new BankAccount("State Bank ", "Raj", "Firozabad", 283203, 12);

        System.out.println(" BankName is : " + bank.bankName);
        System.out.println(" AccountHolder name is : " + bank.accountHolderName);
        System.out.println("Bank branch : " + bank.bankBranch);
        System.out.println("Branch pinCode : " + bank.branchPinCode);
        System.out.println("Total bankEmployees : " + bank.totalBankEmployees);


    }
}