package class_and_object;

public class Laptop {

    //properties

   String brandName="Lenovo";
   int ram=8;
   String memory="500 GB";

    public static void main(String[] args) {
        //TODO SYNTAX :  ClassName objName= new ClassName();

        Laptop obj= new Laptop();

        System.out.println("Printing Laptop brand "+obj.brandName +" RAM : "+obj.ram+" Memory: "+obj.memory);



    }


}
