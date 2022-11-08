package Package_8_methods;

import java.util.Scanner;

public class User_input_cube {
    public int cube(int a){
        return a*a*a;
    }

    public static void main(String[] args) {
        User_input_cube obj = new User_input_cube();
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter number");
        int a = sc.nextInt();
        System.out.println("cube of "+a+" is " +obj.cube(a));
    }
}
