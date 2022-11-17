package exception_demo;

public class CalculatorException {

    public  int divide(int a, int b){

        System.out.println("befor divide ---");
        int divide=0;
        try {
            divide= a/b;
        }
        catch (Exception e){
            System.out.println("Exception occurod--"+e);

        }
        System.out.println("after divide");
        return  divide;
    }

    public static void main(String[] args) {
        CalculatorException obj = new CalculatorException();
        System.out.println("after creating onject-");

        int result = obj.divide(25,0);
        System.out.println("after calling object--");
        System.out.println("Printing divide :"+result);

    }
}
