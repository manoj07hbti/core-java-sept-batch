package khushi_gautam.Excaption;

public class Calculator {
    public double divide(int a, int b){
        System.out.println("Before divide");
        double num = (double) a/b;
        System.out.println("after divide");
        return num;
    }
    public int multiply(int a, int b){
        System.out.println("Before divide");
        int num1 =  a*b;
        System.out.println("after divide");
        return num1;
    }
    public int  divide2(int a, int b) {
        System.out.println("Before divide");
        int num2=0;
        try {
             num2 = a / b;
        }
        catch (Exception e){
            System.out.println("Exception occurred"+e);
        }
        System.out.println("after divide");
        return num2;
    }
        public static void main (String[]args){
            Calculator obj = new Calculator();
            System.out.println("after creating object");

            double result = obj.divide(5, 0);
            int result1 = obj.multiply(7, 9);
            int result2 = obj.divide2(25, 0);

            System.out.println("after calling method");
            System.out.println(result);
            System.out.println(result1);
            System.out.println(result2);
        }
}