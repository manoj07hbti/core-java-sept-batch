package khushi_gautam.method;

public class Calculator_param {
    //access_specifier return_type method_name(Datatype varName1, datatype varName2,.....){CODE}
    public double addition(double n, double m) {
        double sum = n + m;
        return sum;
    }

    public double substraction(double n, double m) {
        double sub = n - m;
        return sub;
    }

    public double multiplication(double n, double m) {
        double multiply = n * m;
        return multiply;
    }

    public double division(double n, double m) {
        double divide = n / m;
        return divide;
    }

    public static void main(String[] args) {
        Calculator_param obj = new Calculator_param();
        double output = obj.addition(66.2d, 17.2d); // we need pass value of input
        double output1 = obj.substraction(66.2d, 17.2d);
        double output2 = obj.multiplication(66.2d, 17.2d);
        double output3 = obj.division(66.2d, 17.2d);

        System.out.println(output);
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
    }
}
