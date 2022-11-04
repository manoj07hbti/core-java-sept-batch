package assignment_Method;

public class CalculatorIPPara {

    public float addition(float a, float b){
        float sum = a+b;

        return sum;
    }

    public float subtraction(float a, float b){
        float sub = a-b;

        return sub;
    }

    public float multiplication(float a, float b){
        float multi = a*b;

        return multi;
    }

    public float division(float a, float b){
        float div = a/b;

        return div;
    }

    public float mode(float a, float b){
        float mod = a%b;

        return mod;
    }

    public float cube(float a){
        float cub = a*a*a;

        return cub;
    }


    public static void main(String[] args) {
        CalculatorIPPara obj = new CalculatorIPPara();
        //Addition
        float result = obj.addition(78,92);
        System.out.println("Sum of a and b is : " +result);

        //-----------Subtraction---------------------
        result = obj.subtraction(98,92);
        System.out.println("subtraction of a and b is : " +result);

        //-----------Multiplication---------------------
        result = obj.multiplication(8,9);
        System.out.println("multiplication of a and b is : " +result);

        //-----------Division---------------------
        result = obj.division(18,9);
        System.out.println("division of a and b is : " +result);

        //-----------Cube---------------------
        result = obj.cube(5);
        System.out.println("Cube of a is : " +result);


    }
}
