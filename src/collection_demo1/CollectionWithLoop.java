package collection_demo1;

import java.util.ArrayList;
import java.util.Objects;

public class CollectionWithLoop {

    public void storeData(){


        String name="Neeraj Kumar";
        String name2="Jaydeep Singh";
        String name3="Akash";
        String name4="Raj";

        ArrayList list = new ArrayList();
        list.add("Neeraj kumar");
        list.add("Jaydeep SIngh");
        list.add("Akash");
        list.add("Raj");

        System.out.println("Printing list--"+list.get(0));
        System.out.println("Printing list--"+list.get(1));
        System.out.println("Printing list--"+list.get(2));
        System.out.println("Printing list--"+list.get(3));


        for (int i= 0 ; i< list.size();i++){

            System.out.println("Printing list for loop--"+list.get(i));

        }
        //Advanced Loop
        for (Object var:list){
            System.out.println("Advanced for Loop--"+var);
        }
        list.remove(3);
        for (Object var:list){
            System.out.println("Advanced for Loop after remove index--"+var);
        }

    }

    public static void main(String[] args) {

        CollectionWithLoop obj= new CollectionWithLoop();
        obj.storeData();

    }
}
