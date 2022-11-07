package method_or_function;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("You have entered name as:"+name);

        System.out.println("Please enter any number");
        int number= scanner.nextInt();
        System.out.println("your number is:"+number);
    }
}
