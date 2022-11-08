package metthod;

import java.util.Scanner;

public class Problem7 {

    public static void main(String[]args){

        float percentage;
        float total_mark;
        float value;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number::");
        value=scanner.nextFloat();
        System.out.println("enter total mark:::");
        total_mark=scanner.nextFloat();

        percentage=(float)((value/total_mark)*100);
        System.out.println("percentage :::"+percentage);


    }

}
