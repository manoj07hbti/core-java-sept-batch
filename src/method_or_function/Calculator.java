package method_or_function;

public class Calculator {
    public void addition(){
        int a=45;
        int b=5;
        int sum=a+b;
        System.out.println("Addtion of ab is a+b="+sum);
    }
    public void substraction(){
        int a=31;
        int b=5;
        int sub=a-b;
        System.out.println("Subraction is ab is a-b="+sub);
    }
    public void multiplication(){
        int a=11;
        int b=11;
        int multiply=a*b;
        System.out.println("Multiplication of ab is a*b="+multiply);
    }
    public void division(){
        int a=8;
        int b=2;
        int divide=a/b;
        System.out.println("Division of ab is a/b="+divide);
    }

    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addition();
        obj.substraction();
        obj.multiplication();
        obj.division();
    }
}
