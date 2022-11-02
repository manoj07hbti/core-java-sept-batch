package method_or_function;

public class BankAccount {

    public void openAccount() {

        System.out.println("OPEN ACCOUNT : PRINTING BANK PASSBOOK");

        String accountHolder = "SHIVANI SHARMA";
        String branch = " AGRA ";
        int IFSC_code = 723573265;
        int accountNumber = 002312121234;
        String address = "SIKANDRA, AGRA";

        System.out.println(" accountHolder :  " + accountHolder + "   branch :" + branch + "   IFSC_code : " + IFSC_code + "   accountNumber :" + accountNumber+  "    address : "  + address);

    }
    public void updateAddress(){

        System.out.println("UPDATE ADDRESS : PRINTING BANK PASSBOOK");

        String accountHolder = "SHIVANI SHARMA";
        String branch = " AGRA ";
        int IFSC_code = 723573265;
        int accountNumber = 002312121234;
        String address = "KHANDARI, AGRA";

        System.out.println(" accountHolder :  " + accountHolder + "   branch :" + branch + "   IFSC_code : " + IFSC_code + "   accountNumber :" + accountNumber+  "    address : "  + address);

    }
    public void closeAccount(){

        System.out.println("CLOSE ACCOUNT :");

        String accountHolder = "SHIVANI SHARMA";
        String branch = " AGRA ";
        int IFSC_code = 723573265;
        int accountNumber = 002312121234;
        String address = "SIKANDRA, AGRA";

        System.out.println(" accountHolder :  " + accountHolder + "   branch :" + branch + "   IFSC_code : " + IFSC_code + "   accountNumber :" + accountNumber+  "    address : "  + address);

    }



           public static void main(String[] args) {

             BankAccount obj = new BankAccount();
             obj.openAccount();
             obj.updateAddress();
             obj.closeAccount();
    }

    }



