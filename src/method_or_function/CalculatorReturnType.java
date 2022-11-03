package method_or_function;

public class CalculatorReturnType {
    public int addition(){
        int a=2;
        int b=3;
        int sum=a+b;
        return sum;
    }
    public int substraction(){
        int a=2;
        int b=3;
        int sub=a-b;
        return sub;
    }
    public int multiplication(){
        int a=2;
        int b=3;
        int multiply=a*b;
        return multiply;
    }
    public double division(){
        int a=7;
        int b=3;
        double divide=(double) a/b;
        return divide;
    }

    public static void main(String[] args) {
        CalculatorReturnType obj=new CalculatorReturnType();
        int result= obj.addition();
        System.out.println("Addition is a+b="+result);
        int subs=obj.substraction();
        System.out.println("Substraction of a-b="+subs);
        int multi= obj.multiplication();
        System.out.println("Multiplication of a*b="+multi);
        double div= obj.division();
        System.out.println("Division od a/b="+div);
    }
}
