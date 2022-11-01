package class_and_object;

public class BankPara {
    String name;
    int accNumber;
    String place;

    public BankPara(String name, int accNumber, String place) {
        this.name = name;
        this.accNumber = accNumber;
        this.place = place;
    }

    public static void main(String[] args) {
        BankPara bank=new BankPara("SBI",14526,"Agra");
        System.out.println("Bank name="+bank.name+", account num="+bank.accNumber+", place="+bank.place);

        BankPara bank2=new BankPara("Canara",4526,"Mathura");
        System.out.println("Bank name="+bank2.name+", account num="+bank2.accNumber+", place="+bank2.place);

    }
}
