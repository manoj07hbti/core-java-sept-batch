package methods_or_function;

public class MethodInput {

  public int  addition(){

      int a = 25;
      int b = 20;
       int sum= a+b;
        return sum;

  }

  public int multiplication(){

      int a = 24;
      int b = 21;
      int multiply= a*b;
      return multiply;
  }

  public static void main(String args[]){
      MethodInput obj= new MethodInput();

      int result= obj.addition();
      System.out.println("Sum is "+result);

       int number = obj.multiplication();
       System.out.println("Multiply is " +number);
  }




}
