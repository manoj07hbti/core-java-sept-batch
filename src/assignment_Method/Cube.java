package assignment_Method;

import java.util.Scanner;

public class Cube {
    public int cube(int a ){
        return (a*a*a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ::");
        int a = scanner.nextInt();
        Cube obj = new Cube();
        int result = obj.cube(a);
        System.out.println( "Cube of " +a+ " is ::" +result);


    }
}
