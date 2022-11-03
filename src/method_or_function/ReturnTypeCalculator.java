package method_or_function;

public class ReturnTypeCalculator {

    public int addition() {
        int a = 40;
        int b = 20;
        int add = a + b;

        return add;
    }

    public int subtraction(){

        int a = 50;
        int b = 10;
        int sub = a - b;

        return sub;

    }

    public int multiplication(){

        int a = 12;
        int b = 20;
        int mul = a * b;

        return mul;
    }

    public int division(){

        int a = 70;
        int b = 7;
        int div = a / b;

        return div;
    }


    public static void main(String[] args) {

        System.out.println("CALCULATOR");

        ReturnTypeCalculator obj = new ReturnTypeCalculator();

        int output = obj.addition();
        System.out.println("SUM is: " + output);

        int output1 = obj.subtraction();
        System.out.println("SUB is: " +output1);

        int output2 = obj.multiplication();
        System.out.println("MUL is: "  +output2);

        int output3 = obj.division();
        System.out.println("DIV is: " +output3);

    }
}
