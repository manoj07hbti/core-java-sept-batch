package class_and_obj;

public class Laptop {

    String brandName="HP";
    int ram=8;
    String memory="500 GB";

    public static void main(String[] args) {
        //TODO SYNTAX :  ClassName objName= new ClassName();

        class_and_obj.Laptop obj = new class_and_obj.Laptop();

        System.out.println("Printing Laptop brand " + obj.brandName + " RAM : " + obj.ram + " Memory: " + obj.memory);

    }

    }
