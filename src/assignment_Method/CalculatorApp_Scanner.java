package assignment_Method;

import java.util.Scanner;

public class CalculatorApp_Scanner {

    public int add(int a , int b ){
        return (a+b);
    }

    public int sub(int a , int b ){
        return (a-b);
    }
    public int div(int a , int b ){
        return a/b;
    }
    public int multi(int a , int b ){
        return (a*b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator App: Please Enter Your Choice 1:Addition ,2:Subtraction , 3:division , 4:Multiplication");
        int choice = scanner.nextInt();
        System.out.println("Please Enter Value of a");
        int a = scanner.nextInt();
        System.out.println("Please Enter Value of b");
        int b = scanner.nextInt();
        int result;

        switch (choice){
            case 1: CalculatorApp_Scanner obj = new CalculatorApp_Scanner();
                result = obj.add(a,b);
                System.out.println("Addition of a and b  is : " +result);
                break ;
            case 2: CalculatorApp_Scanner obj1 = new CalculatorApp_Scanner();
            result = obj1.sub(a,b);
            System.out.println("Subtraction of a and b  is : " +result);
                break ;
            case 3: CalculatorApp_Scanner obj2 = new CalculatorApp_Scanner();
                result = obj2.div(a,b);
                System.out.println("Addition of a and b  is : " +result);
                break ;
            case 4: CalculatorApp_Scanner obj3 = new CalculatorApp_Scanner();
                result = obj3.multi(a,b);
                System.out.println("Addition of a and b  is : " +result);
                break ;
            default:
                System.out.println("Please Enter Right Choice Between 1 -4");


        }

//        CalculatorApp_Scanner obj = new CalculatorApp_Scanner();
//        int result = obj.add(a,b);

//        System.out.println("Addition of a and b  is : " +result);

    }
}
