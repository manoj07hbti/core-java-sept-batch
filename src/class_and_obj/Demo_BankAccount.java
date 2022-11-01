package class_and_obj;

public class Demo_BankAccount {

    String name;
    String branch;
    String manager;
    int code;

    public Demo_BankAccount(String name, String branch, String manager, int code) {
        this.name = name;
        this.branch = branch;
        this.manager = manager;
        this.code = code;
    }

    public static void main(String[] args) {

        Demo_BankAccount bank = new Demo_BankAccount("SBI",  "Jalesar", "JYOTI", 012);

        System.out.println("name: "  +bank.name+ "   branch: " +bank.branch+ "  manager: " +bank.manager+ "  code: " +bank.code);

        Demo_BankAccount bank1 = new Demo_BankAccount("BOB",  "ETAH", "PARTH", 111);

        System.out.println("name: "  +bank1.name+ "   branch: " +bank1.branch+ "  manager: " +bank1.manager+ "  code: " +bank1.code);

        Demo_BankAccount bank2 = new Demo_BankAccount("PNB",  "AGRA", "SHIVANI", 222);

        System.out.println("name: "  +bank2.name+ "   branch: " +bank2.branch+ "  manager2: " +bank.manager+ "  code: " +bank2.code);

        Demo_BankAccount bank3 = new Demo_BankAccount("BOI",  "AWAGARH", "LAVISH", 778);

        System.out.println("name: "  +bank3.name+ "   branch: " +bank3.branch+ "  manager: " +bank3.manager+ "  code: " +bank3.code);

    }
}
