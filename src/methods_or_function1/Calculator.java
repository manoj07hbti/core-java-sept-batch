package methods_or_function1;

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
    public void sub (){

        System.out.println("This is sub method");
        int a=23;
        int b=34;
        int sub=a-b;

        System.out.println("Sub is "+sub);
    }
    //mul a*b
    public void multi(){

        int a =2;
        int b =6;

        int multi = a*b;
        System.out.println( "This multi"+multi);
    }
    //divide a/b
    public void divede(){
        int a= 4;
        int b= 20;
        int divide=a/b;
        System.out.println("This is divede"+divide);

    }

    public static void main(String[] args) {

        Calculator obj=new Calculator();
        obj.addition();
        obj.sub();
        obj.divede();
        obj.multi();
}
}
