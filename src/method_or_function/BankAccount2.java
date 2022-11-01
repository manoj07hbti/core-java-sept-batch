package method_or_function;

public class BankAccount2 {

    public void openAccountMethod(){

        System.out.println("This is open account method :");
    }

    public void closeAccountMethod(){

        System.out.println("This is close account method :");
    }

    public void updateAccountMethod(){

        System.out.println("this is update account method :");
    }

    public void updateMobileMethod(){

        System.out.println("This is mobile update method :");
    }

    public static void main(String[] args) {
        BankAccount2 bankAccount=new BankAccount2();
        bankAccount.openAccountMethod();
        bankAccount.closeAccountMethod();
        bankAccount.updateAccountMethod();
        bankAccount.updateMobileMethod();
    }
}
