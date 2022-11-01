package assignment;

public class BankAccount {
    String bankName;
    String branchName;
    int totalEmployee;

    public BankAccount(String bankName, String branchName, int totalEmployee) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.totalEmployee = totalEmployee;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("ICICI","Tundla",10);
        System.out.println("Bank Name:" + bank.bankName + " Location: " +bank.branchName+ " Total number of employees :" +bank.totalEmployee);

        BankAccount bank2 = new BankAccount("SBI","Agra",21);
        System.out.println("Bank Name:" + bank2.bankName + " Location: " +bank2.branchName+ " Total number of employees :" +bank2.totalEmployee);
    }
}
