package class_object1;

public class Bank {

    // Todo : properties

    String name = "Bank of India";
    int pinCode = 283145;
    String branch = "Firozabad";


    // Todo : capabilities
    // transfer money
    // deposit money
    // write
    // Create money


    public static void main(String[] args) {

        // Todo : Create a object by the constructor method

        //Todo Syntax : ClassName objectName = new ClassName();
                        Bank bank = new Bank();
        System.out.println("Printing the Bank name : " + bank.name);
        System.out.println("Printing the pinCode : " + bank.pinCode);
        System.out.println("Printing the branchName : " + bank.branch);

        System.out.println("Printing the Bank details : " + bank.name +":" +bank.pinCode +":"+ bank.branch );

    }
}

