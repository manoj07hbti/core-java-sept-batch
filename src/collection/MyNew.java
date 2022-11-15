package collection;
import java.util.Scanner;

public class MyNew {
     public int add(int a, int b){
         return  a + b;
     }
     public int sub(int a, int b){
         return a-b;
     }

    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int result = 0;

        System.out.println("please select 1 for add.. 2 for sub");
        int choice=Scanner.nextInt();
        MyNew obj=new MyNew();

        int a=0;
        int b=0;

        if (choice==1 || choice==2) {
            System.out.println("type the value of a");
            a=Scanner.nextInt();

            System.out.println("type the valule of b");
            b=Scanner.nextInt();
        }
        if (choice==1) {
            result = obj.add(a, b);
            System.out.println("this is ans of add  " +result);
        } else if (choice==2) {

            result = obj.sub(a, b);
            System.out.println("this is the answer of sub  " +result);
        }else {
            System.out.println("u r choosing wrong option");
        }

        


    }




}
