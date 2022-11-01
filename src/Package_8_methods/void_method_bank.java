package Package_8_methods;

public class void_method_bank {
    public void closeAccount(){
        System.out.println("The account is being closed.");
    }

    public void updateAddress(){
        System.out.println("Please enter new address.");
    }
    public void updateMobileNumber(){
        System.out.println("Please enter new 10 digit mobile number.");

    }

    public static void main(String[] args) {
        void_method_bank bank = new void_method_bank();
        bank.updateMobileNumber();
    }
}
