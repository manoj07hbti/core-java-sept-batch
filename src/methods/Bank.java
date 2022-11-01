package methods;

public class Bank {
    // TODO SYNTAX ACCESS_SPECIFIER RETURN_TYPE METHOD_NAME (PARAMETER)(CODE...)
    public void updateAccount(){
        System.out.println("Your name is updated.");
    }
    public void address(){
        System.out.println("Your address is updated");
    }

    public static void main(String[] args) {
        Bank obj=new Bank();
        obj.updateAccount();
        obj.address();
    }
}
