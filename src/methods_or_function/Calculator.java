package methods_or_function;

public class Calculator {


    //add
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void addition(){

        System.out.println("This is addition method");
        int a=23;
        int b=34;
        int sum=a+b;

        System.out.println("Sum is "+sum);
    }

    //sub a-b
    //mul a*b
    //divide a/b

    public static void main(String[] args) {

        Calculator obj=new Calculator();
        obj.addition();

    }
}
