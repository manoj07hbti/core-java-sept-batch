package input_type_assignment;

public class CalculatorInputParam {

    public double addition(double a, double b) {

        double sum = a + b;

        return sum;
    }

    public double subtraction(double a, double b) {

        double sub = a - b;

        return sub;
    }

    public double multiplication(double a, double b) {

        double multi = a * b;

        return multi;
    }

    public double division(double a, double b) {

        double div = a / b;

        return div;
    }

    public static void main(String[] args) {

        CalculatorInputParam obj = new CalculatorInputParam();

        double result = obj.addition(66.77, 59.88);
        System.out.println("sum is " + result);

        result = obj.subtraction(77.3, 56.9);
        System.out.println("sub is " + result);

        result = obj.multiplication(37.2, 5.9);
        System.out.println("multiple of a and b is " + result);

        result = obj.division(172.76, 8.6);
        System.out.println("division of a by b is  " + result);
    }
}

