package methods_function;

public class Calculator {
    // Todo : properties
    String colour;
    int price;
    int size;

 /* todo    Member function or method -- capabilities
        Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/
    // Todo : capabilities
    //read
    //write
    //calculate


    // Todo STEP 1: addition
    //  Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void addition () {
        System.out.println("This is Addition Method....");

        int a = 20;
        int b = 30;
        int c = 40;
        int sum = a+b+c;
        System.out.println("Addition is : " + sum );
    }

    // Todo Step2 : subtraction
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void subtraction (){
        System.out.println("This is Subtraction Method....");
        int a = 100;
        int b = 50;
        int c = 20;
        int result = a-b-c;
        System.out.println("Subtraction is : " + result );
    }

    // Todo Step3 : Multiplication
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void multiplication () {
        System.out.println("This is Multiplication Method....");
        int a = 10;
        int b = 20;
        int c = 30;
        int result1 = a*b*c;
        System.out.println("Multiplication is : " + result1);
    }

    // Todo Step4 : Division
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void division (){
        System.out.println("This is Division Method....");
        int a = 500;
        int b = 100;
        int c = 5;
        int result2 = a/b/c;
        System.out.println("Division is : " + result2);
    }

    public static void main(String[] args) {
        //Todo Syntax :  ClassName  objectName = new ClassName();
        Calculator calculator = new Calculator();

        // Create object
        // objName.MethodName();
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();

    }

    }
