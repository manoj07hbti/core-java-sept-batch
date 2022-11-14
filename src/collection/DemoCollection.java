package collection;

import java.util.ArrayList;

public class DemoCollection {

    public void Information() {

        //TODO SYNTAX :  CollectionName objName= new CollectionName();

        ArrayList data = new ArrayList();
        data.add("Aman");       // INDEX 0
        data.add(24);           // INDEX 1
        data.add("cricket");    // INDEX 2
        data.add("Agra");       // INDEX 3
        data.add(9119076474l);  // INDEX 4
        data.add(1234567.89);   // INDEX 5
        data.add("DBRAU");      // INDEX 6
        data.add(282006);       // INDEX 7
        data.add('A');          // INDEX 8
        data.add('N');          // INDEX 9
        data.add('H');          // INDEX 10

        //  PRINTING WITH INDEX METHOD

        System.out.println("My name is " + data.get(0));
        System.out.println("My age is " + data.get(1));
        System.out.println("My Hobby is " + data.get(2));
        System.out.println("My City is " + data.get(3));
        System.out.println("My Mob Num is " + data.get(4));
        System.out.println("double num is " + data.get(5));
        System.out.println("My University is " + data.get(6));
        System.out.println("My PIN CODE is " + data.get(7));
        System.out.println("Name starts with char is " + data.get(8));
        System.out.println("Middle letter " + data.get(9));
        System.out.println("Final letter " + data.get(10));

        //  PRINTING WITH FOR LOOP

        for ( int i=0; i<data.size(); ++i){

            System.out.println("PRINTING WITH FOR LOOP : " +data.get(i));
        }

        // PRINTING WITH ADVANCE FOR LOOP

        for (Object lol : data){

            System.out.println("PRINTING WITH ADVANCE FOR LOOP : " +lol);
        }

        //  REMOVING INDEX

        data.remove(7);
        data.remove(5);


        for ( Object lol : data){

            System.out.println("After Removing WITH ADVANCE FOR LOOP : " +lol);
        }

        System.out.println("Printing index " + data.get(7));


    }


    public static void main(String[] args) {

        DemoCollection obj = new DemoCollection();
        obj.Information();


    }


}
