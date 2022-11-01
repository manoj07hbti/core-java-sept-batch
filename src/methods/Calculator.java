package methods;

public class Calculator {
    public void addition(){
        int a=12;
        int b=13;
        int sum=a+b;
        System.out.println("The sum of the given digits "+sum);

    }
    public void subtraction(){
        int a=25;
        int b=12;
        int subtraction=a-b;
        System.out.println("Thi subtraction of given digits "+subtraction);
    }
    public void multiply(){
        int a=12;
        int b=2;
        int mult=a*b;
        System.out.println("Twelve two's are " +mult);
    }
    public void divide(){
        int a=12;
        int b=2;
        int div=a/b;
        System.out.println("Divide a/b so the value is "+div);

    }


    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.addition();
        obj.subtraction();
        obj.multiply();
        obj.divide();
    }
}
