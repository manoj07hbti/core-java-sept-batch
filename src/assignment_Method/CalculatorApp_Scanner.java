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
        int flag  = 1;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        while (flag ==1){
            System.out.println("Welcome to Calculator App: Please Enter Your Choice 1:Addition ,2:Subtraction , 3:division , 4:Multiplication");
            int choice = scanner.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4){
                System.out.println("Please Enter Value of a");
                int a = scanner.nextInt();
                System.out.println("Please Enter Value of b");
                int b = scanner.nextInt();

                CalculatorApp_Scanner obj = new CalculatorApp_Scanner();
                switch (choice){
                    case 1:
                        result += obj.add(a,b);
                        System.out.println("Addition of a and b  is : " +result);
                        break ;
                    case 2:
                        result += obj.sub(a,b);
                        System.out.println("Subtraction of a and b  is : " +result);
                        break ;
                    case 3:
                        result += obj.div(a,b);
                        System.out.println("Devision of a and b  is : " +result);
                        break ;
                    case 4:
                        result += obj.multi(a,b);
                        System.out.println("Multiplication of a and b  is : " +result);
                        break ;
//                    default:
//                        System.out.println("Please Enter Right Choice Between 1 -4");

                }


            }
            else {
                System.out.println("Please Enter Right Choice Between 1 -4");
            }

            System.out.println("Press 1 to continue Or any other number to Exit");

            flag =scanner.nextInt();
        }


//        CalculatorApp_Scanner obj = new CalculatorApp_Scanner();
//        int result = obj.add(a,b);
//        System.out.println("Addition of a and b  is : " +result);

    }
}
