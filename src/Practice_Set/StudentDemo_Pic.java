package Practice_Set;

import java.util.Scanner;

public class StudentDemo_Pic {
    public static void main(String[]args){

        String name,clss;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the name");

        name=scan.nextLine();
        System.out.println("enter the class");
        clss=scan.nextLine();
        if (clss.equals("Tolystoy")||clss.equals("shakespeare")){
            System.out.println(name+"is student of "+clss);

        }
        else {
            System.out.println("not of any class");
        }

    }
}
















