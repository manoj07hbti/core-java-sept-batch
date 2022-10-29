package class_and_object1;

public class Building_Name {
    String name="Grishma";
    int flat=36;
    int lift=2;

    public static void main(String[] args) {
        Building_Name obj = new Building_Name();
        System.out.println("Building name--"+obj.name);
        System.out.println("Building flat--"+obj.flat);
        System.out.println("Building lift--"+obj.lift);
    }
}
