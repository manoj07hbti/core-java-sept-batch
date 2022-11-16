package exception_demo;

public class CalculatorException {

    public int divide(int a, int b){
        System.out.println(" before divide  ");
        int divide=0;

        try {
            divide=a/b;
        }
        catch (Exception e){
            System.out.println("Exception occured"+ e);
        }
        System.out.println(" after divide  ");
        return divide;
    }

    public static void main(String[] args) {
        CalculatorException obj=new CalculatorException();
        System.out.println(" after creating object ");

        int result=obj.divide(7, 2);
        System.out.println(" after calling method ");
        System.out.println("Printing divide : " + result);
    }
}
