package methods;

public class ReturnTypeCalculator {
    public int addition(){
        int a=12;
        int b=24;
        int add=a+b;
        return add;

    }
    public int subtraction(){
        int a=12;
        int b=24;
        int sub=a-b;
        return sub;}
    public int multiplication(){
        int a=12;
        int b=24;
        int multiply=a*b;
        return multiply;}



    public static void main(String[] args) {
        //TODO ACCESS_SPECIFIER RETURN_TYPE METHOD_NAME(PARAMETER)(CODE.....)
        ReturnTypeCalculator obj=new ReturnTypeCalculator();
       int solution= obj.addition();
        System.out.println("Sum of a and b is:"+solution);
        int answer=obj.subtraction();
            System.out.println("The subtraction of a and b is:"+answer);
            int solu=obj.multiplication();
        System.out.println("multiply of these two number are :"+solu);

    }
}
