package methods_function;

public class CalculatorInputParam {
    // create method

    // Syntax :  access_specifier return_type  method_name (Datatype varName,Datatype varName,.....) {CODE..}
    // Todo Step1 : addition

    public double addition(double a, double b, double c) {
        double sum = a + b + c;
        return sum;
    }

    // Todo Step2 : subtraction
    public double subtraction(double a, double b, double c) {
        double result = a - b - c;
        return result;
    }

    // Todo Step3 : Multiplication
    public double multiplication(double a, double b, double c) {
        double result1 = a * b * c;
        return result1;
    }

    // Todo Step4 : Division
    public double division(double a, double b, double c) {
        double result2 = a / b / c;
        return result2;
    }

    public static void main(String[] args) {
        // Todo : Create object by the constructor
        // ClassName objectName = new ClassName();
        CalculatorInputParam obj = new CalculatorInputParam();
        double output = obj.addition(20.40, 30.50, 40.10);
        System.out.println(output);

        output = obj.subtraction(500.50, 100.00, 200.20);
        System.out.println(output);

        output = obj.multiplication(20.10, 30.40, 22.22);
        System.out.println(output);

        output = obj.division(5000.100, 1000.50, 5.00);
        System.out.println(output);
    }
}
