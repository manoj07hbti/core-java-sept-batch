package methods_assignment;

public class Bank_Account {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    //STEP-1

    public void OpenAccount(){
        System.out.println(" This is an Open Account.");
    }
    public void ClosedAccount(){
        System.out.println(" This is a Closed Account.");
    }
    public void UpdateAddress(){
        System.out.println(" Kindly Update Your Address.");
    }
    public void UpdateMobileNumber(){
        System.out.println(" Kindly Update Your Mobile Number.");
    }

    //STEP-2

    public static void main(String[] args){
        Bank_Account bnk = new Bank_Account();
        bnk.OpenAccount();
        bnk.ClosedAccount();
        bnk.UpdateAddress();
        bnk.UpdateMobileNumber();

    }
}
