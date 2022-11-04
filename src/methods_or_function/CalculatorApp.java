package methods_or_function;


import java.util.Scanner;

public class CalculatorApp {


    public int add(int a, int b){

        return a+b;
    }

    public int sub(int a, int b){

        return a-b;
    }

    public int multi(int a, int b){

        return a*b;
    }

    public double divide(int a, int b){

        return (double)a/b;
    }


    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Welcome to Calculator App: Please enter you choice 1: Addition, 2: Subtraction 3:Multiply and 4:Divide");
        int choice=scanner.nextInt();

        CalculatorApp obj= new CalculatorApp();

        System.out.println("Please enter value of a :");
        int a=scanner.nextInt();

        System.out.println("Please enter value of b :");
        int b= scanner.nextInt();
        int result=0;

       if(choice==1) {
           result = obj.add(a, b);
           System.out.println("Addition is: "+result);
       }
       else if(choice==2){
           result=obj.sub(a,b);
           System.out.println("Subtraction  is: "+result);
       }
       else if(choice==3){
           result=obj.multi(a,b);
           System.out.println("Multiply is: "+result);

       }
       else if(choice==4) {

          double output=obj.divide(a,b);
           System.out.println("Division  is: "+output);
       }
       else {

           System.out.println("Invalid choice please select available choice only ");
       }


    }
}
