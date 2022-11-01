package khushi_gautam;

public class BankAccount {
    String bank;
    String Applicant;
    int IFSC_code;
    long AccountNo;
    //parameterized constructor

    public BankAccount(String bank, String applicant, int IFSC_code, long accountNo) {
        this.bank = bank;
        Applicant = applicant;
        this.IFSC_code = IFSC_code;
        AccountNo = accountNo;
    }

    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("SBI", "mukesh", 5634, 34567272);
        BankAccount bank2 = new BankAccount("PNB", "Rupali", 3456, 76543889);
        BankAccount bank3 = new BankAccount("HDFC", "Harsha", 3452, 76552344);

        System.out.println("BAnk:"+bank1.bank+"  Applicant:"+bank1.Applicant+"  IFSC Code:"+bank1.IFSC_code+"  Account no.:"+bank1.AccountNo);
        System.out.println("BAnk:"+bank2.bank+"  Applicant:"+bank2.Applicant+"  IFSC Code:"+bank2.IFSC_code+"  Account no.:"+bank2.AccountNo);
        System.out.println("BAnk:"+bank3.bank+"  Applicant:"+bank3.Applicant+"  IFSC Code:"+bank3.IFSC_code+"  Account no.:"+bank3.AccountNo);
    }
}
