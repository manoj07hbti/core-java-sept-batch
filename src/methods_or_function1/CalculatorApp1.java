package methods_or_function1;

import methods_or_function.CalculatorApp;

import java.util.Scanner;

public class CalculatorApp1 {

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a, int b){

        return a-b;
    }
    public int multi(int a, int b){
        return a-b;

    }
    public int devide(int a,int b){
        return a/b;

    }

    public static void main(String[] args) {
        int flag=1;
        int result=0;
        Scanner scanner= new Scanner(System.in);
        while(flag==1){

            System.out.println("Welcome to Calculator App: Please enter you choice 1: Addition, 2: Subtraction 3:Multiply and 4:Divide");
            int choice=scanner.nextInt();

            CalculatorApp obj= new CalculatorApp();
            int a=0;
            int b=0;
            if(choice==1 || choice==2 || choice==3 || choice==4) {
                System.out.println("Please enter value of a :");
                a = scanner.nextInt();

                System.out.println("Please enter value of b :");
                b = scanner.nextInt();
            }
            if (choice==1){
                System.out.println("result + \"+\" + \"a:\"+a +\" b: \"+b");
                result+=obj.add(a,b);
                System.out.println("Addition=="+result);
            }
            else if (choice==2){
                result=obj.sub(a,b);
                System.out.println("Sub==="+result);
            }
            else if (choice==3){
                result=obj.multi(a,b);
                System.out.println("Multifircation=="+result);

            }
            else if (choice==4){
                double output = obj.divide(a,b);
                System.out.println("Division=="+result);
            }
            else {
                System.out.println("Invalid choice please select available choice only");
            }
            System.out.println("Press 1 to continue or any other nuber to Exit");
            flag=scanner.nextInt();


        }





    }
}

