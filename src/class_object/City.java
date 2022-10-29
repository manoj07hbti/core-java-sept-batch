package class_object;

public class City {

    String name="Agra";
    int zipcode=282004;
    int population=231400;

    public static void main(String[] args) {

        City obj=new City();
        System.out.println("Printing city name.." +obj.name);
        System.out.println("Printing city zipcode.." +obj.zipcode);
        System.out.println("Printing city population.." +obj.population);
    }
}
