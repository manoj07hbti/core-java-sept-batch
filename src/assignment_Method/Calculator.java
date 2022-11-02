package assignment_Method;

public class Calculator {


    public void add(){
        int a = 25;
        int b = 40;
        int c  = a+b;
        System.out.println("Addition of a and b is : " +c);
    }

    public void Subtraction(){
        int a = 40;
        int b = 20;
        int c  = a-b;
        System.out.println("Subtraction of a and b is : " +c);
    }
    public void division(){
        int a = 40;
        int b = 20;
        int c  = a/b;
        System.out.println("Division of a and b is : " +c);
    }

    public void multiplication(){
        int a = 40;
        int b = 20;
        int c  = a*b;
        System.out.println("Multiplication of a and b is : " +c);
    }
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        cal.add();
        cal.Subtraction();
        cal.division();
        cal.multiplication();
    }
}
