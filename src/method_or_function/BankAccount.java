package method_or_function;

public class BankAccount {
    public void openAccount(){
        System.out.println("This is open account");
    }
    public void closeAccount(){
        System.out.println("This is close account");
    }
    public void updateAddress(){
        System.out.println("Please update your address");
    }
    public void updateMobileNumber(){
        System.out.println("Please update your mobile number");
    }

    public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        obj.openAccount();
        obj.closeAccount();
        obj.updateAddress();
        obj.updateMobileNumber();
    }
}
