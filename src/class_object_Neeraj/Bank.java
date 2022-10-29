package class_object_Neeraj;

public class Bank {

    String name="Kotak bank";

    String address="Tundla";

    String IFSC="KKKBK0000693";

    int employee=76654;

    public static void main(String[] args) {

        Bank obj=new Bank();

        System.out.println("Bank name--"+obj.name);

        System.out.println("Bank address--"+obj.address);

        System.out.println("Bank IFSC code--"+obj.IFSC);

        System.out.println("Total employee--"+obj.employee);
    }
}
