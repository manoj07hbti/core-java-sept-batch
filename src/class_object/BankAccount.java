package class_object;

public class BankAccount {

    String bank_name;
    String bank_ifsc;
    int emp_number;
    String address;

    public BankAccount(String bank_name, String bank_ifsc, int emp_number, String address) {
        this.bank_name = bank_name;
        this.bank_ifsc = bank_ifsc;
        this.emp_number = emp_number;
        this.address = address;
    }

    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount("Bank Of India","BKID0007712",25,"Makkhanpur");
        System.out.println("Bank Name : " +bankAccount.bank_name+ " Bank ifsc code " +bankAccount.bank_ifsc+ " Employees Number : " +bankAccount.emp_number+ " Bank Address : " +bankAccount.address);
    }
}
