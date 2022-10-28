package class_and_object;

public class City {
    String name="Agra";
    int population=197854;
    String famousPlace="Taj Mahal";

    public static void main(String[] args) {
        City obj=new City();
        System.out.println("Name of city is:"+obj.name);
        System.out.println("Population of city is:"+obj.population);
        System.out.println("Famous place of city is:"+obj.famousPlace);
    }
}
