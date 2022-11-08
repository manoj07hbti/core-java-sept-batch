package method_or_function;

import java.util.Scanner;

public class PercentageScanner {

    public static void main(String[] args) {
        double percentage;
        double obtainedMarks;
        double totalMarks;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Obtained Marks: ");
        obtainedMarks= sc.nextDouble();

        System.out.println("Enter Total Marks");
        totalMarks=sc.nextDouble();

        percentage=(double) (obtainedMarks/totalMarks)*100;
        System.out.println("Your Percentages="+percentage+"%");
    }
}
