package methods_or_function;

public class CalculatorReturnType {

    public int addition(){

        int a=121;
        int b=33;

        int sum=a+b;

        return sum;
    }

    //

    public static void main(String[] args) {

        CalculatorReturnType obj= new CalculatorReturnType();

      int result=  obj.addition();
      System.out.println("SUM is "+result);

    }


}
