package Practice_Set;

import java.util.Scanner;

public class Bonus {
    public static void main(String[]Args) {
        int year;
        double salary, TotalAmount;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the year");
        year = obj.nextInt();
        System.out.println("enter the Salary");
        salary = obj.nextDouble();
        if (year > 5) {

            TotalAmount = salary + salary * 0.1;
            System.out.println("Total net bonus amount" + TotalAmount);
        }
        else {
            System.out.println("your service is not more 5 year");
        }
    }

}
