package methods_assignment;

public class Calculator {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    // STEP-1
    public void addition(){
        System.out.println("This is a addition method");
        int a=63;
        int b=36;
        int sum=a+b;
        System.out.println("Sum of a and b is : "+sum);
    }
    public void subtraction(){
        System.out.println("This is a Subtraction Method");
        int x=98;
        int y=100;
        int sub=x-y;
        System.out.println("Sub of y from x is: "+sub);
    }
    public void product(){
        System.out.println("This is a Product Method");
        int a=78;
        int b=87;
        int multi=a*b;
        System.out.println("Product of a and b is: " +multi);
    }
    public void division(){
        System.out.println("This is a Division Method");
        int x=84;
        int y=12;
        int div=x/y;
        System.out.println("division of x with y is: "+div);
    }
    // STEP-2

    public static void main(String[] args) {

        Calculator cal=new Calculator();
        cal.addition();
        cal.subtraction();
        cal.product();
        cal.division();

    }

}
