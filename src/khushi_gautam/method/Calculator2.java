package khushi_gautam.method;

public class Calculator2 {
    //todo Addition Method
    public int addition(){
        System.out.println("This is addition method");
        int a=23;
        int b=34;
        int sum=a+b;
        return sum;
    }
    //todo substration
    public int substration(){
        System.out.println("This is substration method");
        int a=56;
        int b=34;
        int sub=a-b;
        return sub;
    }
    //todo multiplication method
    public int multiplication(){
        System.out.println("This is multiplication method");
        int a=23;
        int b=34;
        int multiply=a*b;
        return multiply;
    }
    //todo division method
    public int division(){
        System.out.println("This is division method");
        int a=524;
        int b=24;
        int divide=a/b;
        return divide;
    }
    public static void main(String[] args) {
        Calculator2 obj=new Calculator2();
        int output=obj.addition();
        System.out.println(output);

        int output1=obj.substration();
        System.out.println(output1);

        int output2=obj.multiplication();
        System.out.println(output2);
        
        int output3=obj.division();
        System.out.println(output3);

    }
}
