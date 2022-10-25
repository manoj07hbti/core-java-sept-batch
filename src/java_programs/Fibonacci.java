package java_programs;

public class Fibonacci {

    public static void main(String[] args) {

      int range=10;

      int num1=0;
      int num2=1;
      int counter=0;

      while(counter<range){

          // Print the number
          System.out.print(num1 + " ");


          int num3 = num2 + num1;
          // Swap
          num1 = num2;
          num2 = num3;


          counter ++;
      }




    }
}
