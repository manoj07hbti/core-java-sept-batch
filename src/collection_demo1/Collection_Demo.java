package collection_demo1;

import java.util.ArrayList;

public class Collection_Demo {

    public void storeInformation(){

        String city1="Pune";
        String city2="Agra";
        String city3="Kanpur";
        String city4="Firozabad";

        ArrayList list=new ArrayList();
        list.add("Pune");
        list.add("Agra");
        list.add("kanpur");
        list.add("Firozabad");

        System.out.println("Printing List-"+list.get(0));
        System.out.println("Printing List-"+list.get(1));
        System.out.println("Printing List-"+list.get(2));
        System.out.println("Printing List-"+list.get(3));

    }

    public static void main(String[] args) {
        Collection_Demo obj= new Collection_Demo();
        obj.storeInformation();

    }
}
