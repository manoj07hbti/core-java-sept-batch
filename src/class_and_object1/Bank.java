package class_and_object1;

public class Bank {
    String Name;
    String State;
    long number;
    long AccNo;

    public Bank(String name, String state, long number, long AccNo) {
        Name = name;
        State = state;
        this.number = number;
        this.AccNo = AccNo;
    }

    public static void main(String[] args) {
        Bank detail=new Bank("State Bank OF India","Uttar Pradesh",6325415847l,93772200041525l);
        System.out.println("Bank Name:"+detail.Name);
        System.out.println("State:" +detail.State);
        System.out.println("Phone Number:" +detail.number);
        System.out.println("Account number:"+detail.AccNo);

    }
}
