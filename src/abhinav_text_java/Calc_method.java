
package abhinav_text_java;
import java.util.Scanner;
class Cal_method{

    static int sum(int a,int b){
        int c;
        c=a+b;
        return c;
    }
    static double div(int a,int b){
        double c = (double)0;
        c=a/b;
        return c;
    }
    static int sub(int a,int b){
        int c = 0;
        c=a-b;
        return c;
    }
    static int mul(int a, int b){
        int c =0;
        c=a*b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("WELCOME!"+'\n'+"ABHINAV'S CALCULATOR");
        Scanner sc = new Scanner(System.in);
        System.out.println("choose calculation method");
        System.out.println("1:addition "+ '\n' + "2:subtraction"+ '\n'+"3:division"+'\n'+"4:multiplication");
        int i=sc.nextInt();
        switch (i){
            case 1:
                System.out.println("You choose addition");
                System.out.println("enter 1st");
                int q=sc.nextInt();
                System.out.println("enter 2nd");
                int w=sc.nextInt();
                int e;
                e=sum(q,w);
                System.out.println(e);
                break;

            case 2:
                System.out.println("you choose substaction");
                System.out.println("enter 1st");
                int q1=sc.nextInt();
                System.out.println("enter 2nd");
                int w1=sc.nextInt();
                int e1;
                e1=sub(q1,w1);
                System.out.println(e1);
                break;

            case 3:
                System.out.println("you choose division");
                System.out.println("enter 1st");
                int q2=sc.nextInt();
                System.out.println("enter 2nd");
                int w2=sc.nextInt();
                double e2;
                e2= div(q2,w2);
                System.out.println(e2);
                break;

            case 4:
                System.out.println("you choose Multiplication");
                System.out.println("enter 1st");
                int q3=sc.nextInt();
                System.out.println("enter 2nd");
                int w3=sc.nextInt();
                int e3;
                e3=mul(q3,w3);
                System.out.println(e3);
                break;

            default:
                System.out.println("Please, enter valid input");

        }
        System.out.println("THANKS!! FOR USING THIS CALCULATOR");


    }

}
