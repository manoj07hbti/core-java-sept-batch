package my_class_and_object;
import java.util.Scanner;

public class City {
    String name;
    int population;

    public void cityDetail() {


        System.out.println("Enter Your City Name :");
        name = new Scanner(System.in).nextLine();
        System.out.println("Enter Your City Population :");
        population = new Scanner(System.in).nextInt();

    }

    public static void main(String args[]) {
        City obj = new City();
        obj.cityDetail();
        System.out.println(" "+obj.name);
        System.out.println(" "+obj.population);
    }
}
