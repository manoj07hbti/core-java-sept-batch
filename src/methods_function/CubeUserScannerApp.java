package methods_function;

import java.util.Scanner;

public class CubeUserScannerApp {

     // create method
     // Syntax :  access_specifier return_type  method_name (Datatype varName,Datatype varName,.....) {COde}
    public int cubeApp(int number){

        return number*number*number;
    }

    public static void main(String[] args) {
        // Create scanner class

        Scanner obj = new Scanner(System.in);
        System.out.println(" Please enter any number by User  : ");
        int number = obj.nextInt();
        System.out.println( " You have entered number as : " + number);


        CubeUserScannerApp cube = new CubeUserScannerApp();
        int result = cube.cubeApp(number);
        System.out.println(result);
    }




}
