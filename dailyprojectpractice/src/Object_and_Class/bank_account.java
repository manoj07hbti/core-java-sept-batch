package Object_and_Class;

public class bank_account {

    String name;
    String bank;
    long number;
    String branch;
    long mobile;

    public bank_account(String name, String bank, long number, String branch, long mobile) {
        this.name = name;
        this.bank = bank;
        this.number = number;
        this.branch = branch;
        this.mobile = mobile;
    }

    public static void main(String args[]){
                       bank_account Details= new bank_account("Akshat", "HDFC bank", 852670054, "Noida", 200452068);
                       System.out.println("name:"+Details.name);


    }

}
