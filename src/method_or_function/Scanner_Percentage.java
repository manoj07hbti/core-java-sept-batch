package method_or_function;

import java.util.Scanner;

public class Scanner_Percentage {


    public static void main(String[] args) {

        int n = 5;
        while (n!= 0) {

            Scanner value = new Scanner(System.in);

            System.out.println("please enter the marks:  ");
            float marks = (float) value.nextDouble();

            System.out.println("please enter the total marks:   ");
            float total_marks = (float) value.nextDouble();

            float percentage = (marks / total_marks) * 100;

            System.out.println("percentage of students:  " + percentage);
            n--;
        }

    }
}
