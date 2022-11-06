package metthod;

import java.util.Scanner;

public class Functions {
    public static int calculateSum(int a,int b ){
        int sum= a+b;
        return sum;

    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int b= scanner.nextInt();
        int a=scanner.nextInt();


        int sum= calculateSum(a,b);
        System.out.println("sum of 2 number:"+sum);


    }

}
