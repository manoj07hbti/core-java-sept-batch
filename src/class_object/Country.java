package class_object;

public class Country {

    String name="INDIA";
    int states=29;
    int population=1350000000;
    String capital="NEW DELHI";

    public static void main(String[] args) {

        Country obj=new Country();

        System.out.println("Showing Country Name--" +obj.name);
        System.out.println("Showing Country States--" +obj.states);
        System.out.println("Showing Country Population--" +obj.population);
        System.out.println("Showing Country Capital--" +obj.capital);

    }
}
