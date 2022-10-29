package class_object_Neeraj;

public class Building {

    String building_name="Grishma_Apartment";

    String Address="Hinjewadi";

    int floor=4;

    int flat_number=401;

    public static void main(String[] args) {

        Building obj=new Building();

        System.out.println("Building name--"+obj.building_name);

        System.out.println("Address---"+obj.Address);

        System.out.println("Total floor--"+obj.floor);

        System.out.println("flat number--"+obj.flat_number);
    }
}
