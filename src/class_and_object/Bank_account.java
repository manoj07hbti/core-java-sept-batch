package class_and_object;

public class Bank_account {
    String name;
    int accountNum;
    String accType;

    public Bank_account(String name, int accountNum, String accType) {
        this.name = name;
        this.accountNum = accountNum;
        this.accType = accType;

    }
    public static void main(String[] args) {
        Bank_account coustmer1 =new Bank_account("Gaurav",14267,"Saving ");
        Bank_account coustmer2 =new Bank_account("Amit",14268,"Current ");
        Bank_account coustmer3 =new Bank_account("Gaurav",14269,"Merchant ");
        System.out.println("Name: "+coustmer1.name+"\n"+"Account number: "+coustmer1.accountNum+"\n"+"Account type: "+coustmer1.accType);
        System.out.println("Name: "+coustmer2.name+"\n"+"Account number: "+coustmer2.accountNum+"\n"+"Account type: "+coustmer2.accType);
        System.out.println("Name: "+coustmer3.name+"\n"+"Account number: "+coustmer3.accountNum+"\n"+"Account type: "+coustmer3.accType);
    }
}
