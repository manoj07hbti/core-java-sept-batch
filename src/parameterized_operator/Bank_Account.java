package parameterized_operator;

public class Bank_Account {


    String name;
    String Branch;
    String IFSC_Code;

    public Bank_Account(String name, String branch, String IFSC_Code) {
        this.name = name;
        Branch = branch;
        this.IFSC_Code = IFSC_Code;
    }



    public static void main(String[] args){

        Bank_Account bnk = new Bank_Account("SBI","Agra", "SBIN0009968");
        System.out.println("Name: "+bnk.name+ " Branch: "+bnk.Branch+ " IFSC_Code" +bnk.IFSC_Code);
        Bank_Account bnk2 = new Bank_Account(" BOI","Mathura","BKID0006850");
        System.out.println("Name: "+bnk2.name+ " Branch: "+bnk2.Branch+ " IFSC_Code: "+bnk2.IFSC_Code);
        Bank_Account bnk3= new Bank_Account(" Canara", "Delhi", "CNRB000307");
        System.out.println("Name: "+bnk3.name+ " Branch: "+bnk3.Branch+ " IFSC_Code: "+bnk3.IFSC_Code);

    }


}
