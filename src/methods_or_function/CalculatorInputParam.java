package methods_or_function;

public class CalculatorInputParam {


    public int addition(int a, int b) {

        int sum = a + b;

        return sum;
    }


    public static void main(String[] args) {

        CalculatorInputParam obj = new CalculatorInputParam();
        int result = obj.addition(23, 56);

        System.out.println("sum is " + result);

        result = obj.addition(213, 56);
        System.out.println("sum is " + result);
    }
}
