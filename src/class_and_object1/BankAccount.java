package class_and_object1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class BankAccount {
    String name="Saving";
    long account=771210110000555l;
    String Ifsc="BKID0007712";
    String bank_name="Bank of india";

    public BankAccount(String name, long account, String ifsc, String bank_name) {
        this.name = name;
        this.account = account;
        Ifsc = ifsc;
        this.bank_name = bank_name;
    }

    public static void main(String[] args) {
        BankAccount obj  =new BankAccount("Saving",771210110000555l,"BKID0007712","Bank of india");
        BankAccount obj1 =new BankAccount("Saving",771210110000588l,"SBIN00122225","SBI");

        System.out.println("Name: "+obj.name+" Bank of india: "+obj.bank_name+" Account: "+obj.account);
        System.out.println("Name: "+obj.name+" SBI: "+obj.bank_name+" Account: "+obj.account);

    }


}
