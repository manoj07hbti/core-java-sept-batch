package method_or_function;

import java.util.Scanner;

public class Scanner_Cube {


    public static void main(String[] args) {


        int n = 5;
        while(n!= 0) {

            Scanner s = new Scanner(System.in);

            System.out.println("Enter the side of cube:");
            double side = s.nextDouble();

            double volume = side * side * side;
            System.out.println("Cube is: " + volume);
            n--;
        }

    }
}
