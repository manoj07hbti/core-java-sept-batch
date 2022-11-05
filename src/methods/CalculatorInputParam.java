package methods;

public class CalculatorInputParam {
    public int numbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public double numbers(double a, double b) {
        double multiply = a * b;
        return multiply;
    }
    public float subtract(float a,float b){
        float Subtraction=a-b;
        return Subtraction;
    }

    public static void main(String[] args) {
        CalculatorInputParam result = new CalculatorInputParam();
        int solve = result.numbers(24, 26);

        System.out.println("The sum of two numbers is " + solve);
        solve =result.numbers(24,60);
        System.out.println(solve);
        double resul = result.numbers(25.63d, 56.42d);
        System.out.println(resul);
        float Answer=result.subtract(24.7f,24.14f);
        System.out.println(Answer);

    }

}

