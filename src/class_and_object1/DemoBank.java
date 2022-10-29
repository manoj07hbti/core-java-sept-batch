package class_and_object1;

public class DemoBank {

    String name = "Bank of India";
    long account = 7712101110000223l;
    String IFSC= "BKID0007712";

    public static void main(String[] args) {
        DemoBank obj =new DemoBank();
        System.out.println("Bank name--"+obj.name);
        System.out.println("Bank Account No.--"+obj.account);
        System.out.println("IFSC CODE --"+obj.IFSC);
    }
}
