package Method_and_Function;

public class bank_account {
    String name;
    String bank;
    int number;

    public void openMethod(){
        System.out.println("This account is open");

    }

    public void closedMethod(){
        System.out.println("This account is closed");
    }

    public void addressMethod(){
        System.out.println("This is my updated Address");
    }
    public void mobileMethod(){
        System.out.println("This is my updated mobile Address");
    }
    public static void main(String[] args) {
        bank_account obj= new bank_account();

        obj.openMethod();
        obj.closedMethod();

        obj.addressMethod();
        obj.mobileMethod();
    }




}
