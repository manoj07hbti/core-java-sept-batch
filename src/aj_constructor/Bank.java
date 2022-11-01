package aj_constructor;

public class Bank {
    String name;
    long accountNo;
    String branch;
    double amount;

    public Bank(String name, long accountNo, String branch, double amount) {
        this.name = name;
        this.accountNo = accountNo;
        this.branch = branch;
        this.amount = amount;
    }

    public static void main(String[] args) {
        Bank b1= new Bank("Adesh",11223445, "Tundla",33500);
        System.out.println("Account holder name: "+b1.name+"\nAccount No. :"+ b1.accountNo+"\nBranch name: "+ b1.branch+"\nTotal amount: "+ b1.amount);

        Bank b2= new Bank("Ajay",11229854, "Firozabad",102157.7);
        System.out.println("\nAccount holder name: "+b2.name+"\nAccount No. :"+ b2.accountNo+"\nBranch name: "+ b2.branch+"\nTotal amount: "+b2.amount);

    }
}
