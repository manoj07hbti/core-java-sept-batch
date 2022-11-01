package khushi_gautam.method;

public class Calculator {
    //todo Addition Method
    public void addition(){
        System.out.println("This is addition method");
        int a=23;
        int b=34;
        int sum=a+b;
        System.out.println(sum);
    }
    //todo substration
    public void Substration(){
        System.out.println("This is substration method");
        int a=56;
        int b=34;
        int sub=a-b;
        System.out.println(sub);
    }
    //todo multiplication method
    public void multiplication(){

        System.out.println("This is multiplication method");
        int a=23;
        int b=34;
        int multiply=a*b;
        System.out.println(multiply);
    }
    //todo division method
    public void division(){
        System.out.println("This is division method");
        int a=524;
        int b=24;
        int divide=a/b;
        System.out.println(divide);
    }
    public static void main(String[] args) {

        Calculator obj=new Calculator();
        obj.addition();
        obj.Substration();
        obj.multiplication();
        obj.division();

    }
}
