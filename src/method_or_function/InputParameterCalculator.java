package method_or_function;

public class InputParameterCalculator {

    public int addition(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public int subtraction(int a, int b) {

        int sub = a - b;

        return sub;
    }

    public int multiplication(int a, int b) {

        int mul = a * b;

        return mul;
    }

    public int division(int a, int b) {

        int div = a / b;

        return div;
    }

    public int modulus(int a, int b) {

        int mod = a % b;

        return mod;
    }


    public static void main(String[] args) {

        InputParameterCalculator obj = new InputParameterCalculator();
        int result = obj.addition(10, 16);

        int result1 = obj.subtraction(23, 12);

        int result2 = obj.multiplication(23, 12);

        int result3 = obj.division(40, 10);

        int result4 = obj.modulus(31, 4);

        System.out.println("sum is " + result);
        System.out.println("sub is " + result1);
        System.out.println("mul is " + result2);
        System.out.println("div is " + result3);
        System.out.println("mod is " + result4);

    }
}

