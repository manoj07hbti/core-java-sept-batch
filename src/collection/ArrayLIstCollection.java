package collection;

import java.util.ArrayList;

public class ArrayLIstCollection {
// normal way

    public void allInformation() {

        // Todo Syntax : CollectionName  objectName = new CollectionName ();
        ArrayList list = new ArrayList();
        list.add("Ram");   //(0) Index
        list.add("Vijay"); //(1) Index
        list.add("Sunil"); //(2) Index
        list.add("Pune");  //(3) Index
        list.add("Mumbai");//(4) Index
        list.add("Agra");  //(5) Index
        list.add(12);      //(6) Index
        list.add(45);      //(7) Index
        list.add(67);      //(8) Index
        list.add(34.50);   //(9) Index


        System.out.println("Printing the Name1 : " + list.get(0));
        System.out.println("Printing the Name2 : " + list.get(1));
        System.out.println("Printing the Name3 : " + list.get(2));
        System.out.println("Printing the cityName1 : " + list.get(3));
        System.out.println("Printing the cityName2 : " + list.get(4));
        System.out.println("Printing the cityName3 : " + list.get(5));
        System.out.println("Printing the number1 : " + list.get(6));
        System.out.println("Printing the number2 : " + list.get(7));
        System.out.println("Printing the number3 : " + list.get(8));
        System.out.println("Printing the number4 : " + list.get(9));

        // Using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" Printing list in loop : " + list.get(i));
        }

        // Using advance for loop
        //Todo Advance for loop : for(DataType var : Array/Collection) {code}
        for (Object var : list) {
            System.out.println("Printing Advance for loop : " + var);
        }

        // remove
        list.remove(2);
        list.remove(4);
        list.remove(7);
        //Todo Advance for loop : for(DataType var : Array/Collection) {code}
        for (Object var : list) {
            System.out.println("Printing After Remove Advance for loop : " + var);
        }
        System.out.println("Reading list at 2 Index  : " + list.get(2));
        System.out.println("Reading list at 4 Index  : " + list.get(4));
        System.out.println("Reading list at 6 Index  : " + list.get(6));
    }

    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        ArrayLIstCollection obj = new ArrayLIstCollection();
        obj.allInformation();


    }

}
