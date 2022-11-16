package collection_demo.hash_map_demo;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public HashMap<Integer, String> createMap(){
    //SYNTAX    HashMap <DATATYPE_key, DATATYPE_Value> varName= new HashMap<>();

        HashMap<Integer, String> course= new HashMap<>();

        //adding value to map  put(key,value);

        course.put(1,"Java");
        course.put(2,"Spring");
        course.put(3,"Spring Boot");
        course.put(4,"Cloud");
        course.put(null,"PCF");
        course.put(1,"Java 8");
        System.out.println(course);


      return course;
    }


    public static void main(String[] args) {

        DemoHashMap obj= new DemoHashMap();

        HashMap<Integer, String> course= obj.createMap();

        // get method : get(key);

        System.out.println("Reading map "+course.get(3));
        System.out.println("Reading map "+course.get(4));

        // how to print all element of map

        Set<Integer> keys= course.keySet();

        for(Integer var : keys){

            System.out.println("Printing map in loop "+course.get(var));
        }


        HashMap<Double, String> map= new HashMap<>();

        map.put(1.5,"FIRST");
        map.put(1.3,"SECOND");
        map.put(null,"Third");
        map.put(null,"Four");
        map.put(1.5,"1SECOND");
        map.put(1.6,"2SECOND");
        map.put(null,"Five");

        System.out.println("*******"+map);
    }

}
