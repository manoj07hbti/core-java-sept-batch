package methods_or_function;

public class MethodReturnType {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public String welcome(){

      String msg="Welcome to Java Programming ....";

        return msg;
    }


    public int makeSquare(){

        int number=2;
        int square=number*number;

        return square;
    }

    public double calculatePercentage(){

        int number=213214;
        int percentage=12;

        double result= (double) (number*percentage)/100;

        return result;

    }


    public static void main(String[] args) {

       MethodReturnType obj = new MethodReturnType();
       String output= obj.welcome();

       System.out.println(output);

      int result= obj.makeSquare();

      System.out.println("Square is "+result);

      double percentage= obj.calculatePercentage();

      System.out.println("Percentage is "+percentage);
    }



}
