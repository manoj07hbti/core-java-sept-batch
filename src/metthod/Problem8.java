package metthod;

import java.util.Scanner;

public class Problem8 {

    public static void main(String[]args){
        int i,n;
        System.out.println("input number of item :");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();

        for (i=1;i<=n;i++){
            System.out.println("number is :"+i+ "and cube :"+(i*i*i) );

        }




    }

}
