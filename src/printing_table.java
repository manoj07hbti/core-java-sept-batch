import java.util.Scanner;
public class printing_table{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter table no. you want to print:");
        int a=sc.nextInt();
        for(int i=1; i<=10; i++){

            System.out.println(i*a);
        }
    }
}

