package assignment_Method;

import java.util.Scanner;

public class PercentageScanner {
    public float percentage (float scored ,float total_marks ){
            return ( (scored/total_marks)*100);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Marks :: " );
        float scored = scanner.nextFloat();
        System.out.println("Enter Total Marks :: " );
        float total_marks = scanner.nextFloat();
        PercentageScanner obj = new PercentageScanner();
        float result = obj.percentage(scored,total_marks);
        System.out.println("Percentage ::" + result);


    }
}
