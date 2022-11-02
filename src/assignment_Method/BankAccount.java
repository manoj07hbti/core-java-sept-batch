package assignment_Method;

public class BankAccount {
    String userName;
    String address;
    String branchName;
    int accountNumber;
    long mobile;

//    public BankAccount(String userName, String address, String branchName, int accountNumber, long mobile) {
//        this.userName = userName;
//        this.address = address;
//        this.branchName = branchName;
//        this.accountNumber = accountNumber;
//        this.mobile = mobile;
//    }

    public void openAccount(){
        System.out.println("Congratulation"  +"Your Account is open ");
    }

    public void closeAccount(){
        System.out.println("Your account is close ");
    }
    public void updateAccount(){
        System.out.println("Your account details are successfully updated ");
    }

    public void mobileNumber(){
        System.out.println("Your Mobile number is successfully updated in our system");
    }

    public static void main(String[] args) {
        BankAccount bankacc = new BankAccount();//("Vikas","Madhu Nagar","Agra",1122334455,9876543210l);
        bankacc.openAccount();
        bankacc.closeAccount();
        bankacc.updateAccount();
        bankacc.mobileNumber();
    }

}
