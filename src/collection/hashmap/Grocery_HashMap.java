package collection.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Grocery_HashMap {


    public HashMap<Double, String> groceryHashMap() {

        HashMap<Double, String> grocery = new HashMap<>();

        grocery.put(2.5, "SUGAR");
        grocery.put(9.7, "TEA");
        grocery.put(5.6, "CUMIN");
        grocery.put(7.7, "CHILI");
        grocery.put(3.5, "COCONUT");
        grocery.put(null, "SAlt");

        return grocery;

    }

    public static void main(String[] args) {

        Grocery_HashMap obj = new Grocery_HashMap();

        HashMap<Double, String> grocery = obj.groceryHashMap();

        System.out.println("reading key data : " + grocery.get(2.5));

        System.out.println("reading key data  : " + grocery.get(3.5));


        //print all elements of map

        Set<Double> keys = grocery.keySet();

        for (Double var : keys) {

            System.out.println("Print map  : " + grocery.get(var));
        }
    }
}



