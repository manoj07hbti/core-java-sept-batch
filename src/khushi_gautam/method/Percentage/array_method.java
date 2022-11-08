package khushi_gautam.method.Percentage;

import java.util.Scanner;

public class array_method {
    public double percentage(double a,double total){ return a* 100/total;}
    public int cube(int n){return n*n*n;}
    public int age( int m){
        return m;
    }

    public static void main(String[] args) {
        Scanner code = new Scanner(System.in);
        array_method obj= new array_method();

        //todo percentage:user input
        double a = code.nextDouble();
        double total = code.nextDouble();
        double output1= obj.percentage(a,total);
        System.out.println("Percentage");
        System.out.println(output1);

        System.out.println(" ");

        //todo cube:user input
        int n = code.nextInt();
        int output2 = obj.cube(n);
        System.out.println("Cube");
        System.out.println(output2);

        System.out.println(" ");

        //todo check eligibility
        int m = code.nextInt();
        int output = obj.age(m);
        System.out.println("Check eligibility");
        System.out.println(output);
       if (m>=18){
            System.out.println("You are eligible  for voting");
        }
        else {
            System.out.println("You are not eligible for voting");
        }
    }
}
