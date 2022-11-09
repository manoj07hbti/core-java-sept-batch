package assignment_Collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Array_List {


    public void information() {
        //TODO SYNTAX : CollectionName objName = new CollectionName();
        ArrayList list = new ArrayList();
        list.add("Agra");
        list.add("Delhi");
        list.add("Amritsar");
        list.add(9898989898L);
        list.add(9999999999L);
        list.add(9000000000L);
        list.add(283204);
        list.add(281020);
        list.add(280001);
        list.add(20000.56);
        System.out.println("Reading list at 0 Index : " +list.get(0));
        System.out.println("Reading list at 0 Index : " +list.get(1));
        System.out.println("Reading list at 0 Index : " +list.get(2));
        System.out.println("Reading list at 0 Index : " +list.get(3));
        System.out.println("Reading list at 0 Index : " +list.get(4));
        System.out.println("Reading list at 0 Index : " +list.get(5));
        System.out.println("Reading list at 0 Index : " +list.get(6));
        System.out.println("Reading list at 0 Index : " +list.get(7));
        System.out.println("Reading list at 0 Index : " +list.get(8));
        System.out.println("Reading list at 0 Index : " +list.get(9));
        System.out.println("End of Index");


        //Loop
        System.out.println("Starting of For Loop");
        for (int i=0 ; i < list.size(); i++)
        {

            System.out.println("Reading list in loop :  " +list.get(i));
        }


        //For Advance Loop
        // SYNTAX for (DATATYPE Var : array/collection){Code}
        System.out.println("Advance For Loop");
        for (Object var : list ){
            System.out.println("Reading list in advance for loop :  " +var);
        }

        //Remove
        System.out.println("Remove Index number 3");
        list.remove(3);
        //After Removing Index number 3
        System.out.println("After remove Index number 3");
        for (Object var : list ){
            System.out.println("Reading list in advance for loop :  " +var);
        }



    }

    public static void main(String[] args) {
        Array_List obj = new Array_List();
        obj.information();
    }



}
