package collection.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class DemoHashMap {

    public HashMap<Integer, String> createMap(){

        HashMap<Integer, String> course = new HashMap<>();


        //adding value to map

        course.put(1,"C");
        course.put(2, "AI");
        course.put(3,"c++");
        course.put(4, "C#");
        course.put(5, "JAVA");
        course.put(null, ".net");
        course.put(2, "cloud");

        System.out.println("Print courses  : "   +course);

        return course;

    }

    public static void main(String[] args) {
        DemoHashMap obj = new DemoHashMap();
        HashMap<Integer, String> course= obj.createMap();


        //get method   : get(key);

        System.out.println("reading key data : "   +course.get(5));

        System.out.println("reading key data  : "   +course.get(4));


        //print all elements of map

        Set<Integer> keys = course.keySet();

        for(Integer var : keys){

            System.out.println("Printing map  :"  + course.get(var));


        }
    }
}
