package class_and_obj;

import class_and_object.Book;

public class Bank {

    String bank_name = "SBI";
    int no_of_bank_emp = 10;
    String bank_manager = "Mr. R.V.Rawat";
    String bank_governer = "Shaktikant Das";
    int bank_emp_id = 123123;




    public static void main(String[] args) {
//TODO SYNTAX :  ClassName objName= new ClassName();

        class_and_obj.Bank obj = new Bank(); // obj object created



//TODO objName.propertyname

        System.out.println("Printing bank name    :      " + obj.bank_name);
        System.out.println("Printing bank manager :     "  + obj.bank_manager);
        System.out.println("Printing bank governer:    "   + obj.bank_governer);
        System.out.println("printing bank emp id  :   "    + obj.bank_emp_id);
        System.out.println("printing no of bank emp  : "   +obj.no_of_bank_emp);

    }
}
