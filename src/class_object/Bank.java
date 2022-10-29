package class_object;

public class Bank {

    String name="SBI";
    String IFSC="SBIN0012225";
    int emp=23;

    public static void main(String[] args) {

        //create object

        Bank bk=new Bank();
        System.out.println("Bank name " +bk.name);
        System.out.println("Bank IFSC " +bk.IFSC);
        System.out.println("Bank employee " +bk.emp);

    }
}
