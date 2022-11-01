package method_and_function1;

public class BankAccount {

     String openAccount;
     String closeAccount;
     String updateAddress;
     long updateMobileNumber;

     public void openAccount(){
         System.out.println("This is openAccount method");

     }
     public void closeAccount(){
         System.out.println("This is closeAccount method");
     }
     public void updateAddress(){
         System.out.println("This is updateAddress method");
     }
     public void updateMobileNumber(){
         System.out.println("This is updateMobileNumber method");
     }

    public static void main(String[] args) {
        BankAccount obj =new BankAccount();
        obj.openAccount();
        obj.closeAccount();
        obj.updateAddress();
        obj.updateMobileNumber();
    }
}
