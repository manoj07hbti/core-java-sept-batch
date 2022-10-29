package class_object;

public class Building {

    String name="Taj Mahal";
    String address="Taj ganj Agra";
    String color="White";
    int zipcode=282001;

    public static void main(String[] args) {

        Building obj=new Building();

        System.out.println("Printing Building Name. " +obj.name);
        System.out.println("Printing Building Address. " +obj.address);
        System.out.println("Printing Building Color. " +obj.color);
        System.out.println("Printing Building Zipcode. " +obj.zipcode);
    }

}
