package method_or_function;

public class CalculatorInputParam {
    public double Addition(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public double Substraction(double a, double b) {
        double sub = a - b;
        return sub;
    }

    public double Multiplication(double a, double b) {
        double multi = a * b;
        return multi;
    }

    public double Division(double a, double b) {
        double divide = a / b;
        return divide;
    }

    public static void main(String[] args) {
        CalculatorInputParam obj = new CalculatorInputParam();
        double add = obj.Addition(2.3, 5.4);
        System.out.println("Addition of a+b="+add);

        double subs = obj.Substraction(2.3, 5.4);
        System.out.println("Substraction of a-b="+subs);

        double multiply = obj.Substraction(2.3, 5.4);
        System.out.println("Multiplication of a*b="+multiply);

        double divs = obj.Division(2.3, 5.4);
        System.out.println("Division of a/b="+divs);
    }
}
