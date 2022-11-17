package Exception_Program;

public class CalculatorApp {

   public int divide(int a, int b){
       System.out.println("before divide");
       int divide=5;
       try {
           divide = a / b;
       }
       catch (Exception e) {

           System.out.println("Exception occurod " + e);
       }

        System.out.println("before divide");
        return divide;
   }


   public static void main(String [] args){

       CalculatorApp obj = new CalculatorApp();
       System.out.println("after creating object");
       double result = obj.divide(25, 5);
       System.out.println(" after calling method ");
       System.out.println("Printing divide : " + result);


    }


}
