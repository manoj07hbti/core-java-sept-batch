package assignment_class_and_object;

public class Building {

    String name="Burj Khalifa";
    int floors=162;
    String  height= "828 metres";
    String location= "Dubai";

    public static void main(String[] args) {
        Building abc= new Building();
        System.out.println("Building name : "+abc.name);
        System.out.println("Building floors : "+abc.floors);
        System.out.println("Building Height : "+abc.height);
        System.out.println("Building Location : "+abc.location);
    }
}

