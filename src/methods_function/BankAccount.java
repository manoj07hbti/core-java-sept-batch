package methods_function;

public class BankAccount {
    // Todo : properties
    String name;
    int pinCode;
    String branchName;


 /* todo    Member function or method -- capabilities
        Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/
    // Todo : capabilities
    // openAccount
    // closeAccount
    // updateAddress
    // updateMobileNumber


    // Todo STEP 1: openAccount
    //  Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void openAccountMethod() {
        System.out.println("This is openAccount Method....");
    }

    // Todo Step2 : closeAccount
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void closeAccountMethod(){
        System.out.println("This is closeAccount Method....");
    }

    // Todo Step3 : updateAddress
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void updateAddressMethod() {
        System.out.println("This is updateAddress Method....");
    }

    // Todo Step4 : updateMobileNumber
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void updateMobileNumberMethod(){
        System.out.println("This is updateMobileNumber Method....");
    }

    public static void main(String[] args) {
        //Todo Syntax :  ClassName  objectName = new ClassName();
                        BankAccount bank = new BankAccount();

        // Create object
        // objName.MethodName();
        bank.openAccountMethod();    // objName.MethodName(); --> it is calling eat Method
        bank.closeAccountMethod();
        bank.updateAddressMethod();
        bank.updateMobileNumberMethod();



    }
}
