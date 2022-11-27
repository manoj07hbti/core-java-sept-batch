package Practice_Set;

import java.util.Scanner;

public class Age_practice {
    public static void main(String[]args){
        int a,b,c;
        Scanner number=new Scanner(System.in);
        System.out.println("enter the age of a");
         a=number.nextInt();

        System.out.println("enter the age of b");
        b=number.nextInt();

        System.out.println("enter the age of c ");
        c=number.nextInt();

       if (a>b&&a>c){
           System.out.println("a is the oldest");
       }
       else if(b>a && b>c){
           System.out.println("b is the oldest");
       }
       else {
           System.out.println("c is the oldest");
       }

       if (a<b&&a<c){
           System.out.println("a is the youngest");


       } else if (b<a && b<c) {
       System.out.println("b is the youngest");

       }
       else {
           System.out.println("c is the youngest");

       }
    }

}
