import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose your calculation".toUpperCase());
        System.out.println("1=Addition"+' '+ "2=Multiplication"+' '+   "3=Subtraction" +' '+  "4=Division");
        int a= sc.nextInt();
        if(a==1){
            System.out.println("You choose Addition");
            System.out.println("Please enter first number");
            int b= sc.nextInt();
            System.out.println("Please enter second number");
            int c=sc.nextInt();
            int d=b+c;
            System.out.println("Your answer is :"+' '+d);
        } else if (a==2) {
            System.out.println("You choose Multiplication");
            int e= sc.nextInt();
            System.out.println("Please enter second number");
            int f=sc.nextInt();
            int g=e*f;
            System.out.println("Your answer is :"+' '+g);

        }
        else if (a==3){
            System.out.println("You choose substaction");
            System.out.println("Please enter first number");
            int h= sc.nextInt();
            System.out.println("Please enter second number");
            int i=sc.nextInt();
            int j=h-i;
            System.out.println("Your answer is :"+' '+j);

        } else if (a==4) {
            System.out.println("You choose division");
            System.out.println("Please enter first number");
            int k= sc.nextInt();
            System.out.println("Please enter second number");
            int l=sc.nextInt();
            int m=k/l;
            System.out.println("Your answer is :"+' '+m);
        }
        else if(a!=1 || a!=2 || a!=3 ||  a!=4){
            System.out.println("You entered wrong key, PLEASE TRY AGAIN!! ");
        }




    }
}
