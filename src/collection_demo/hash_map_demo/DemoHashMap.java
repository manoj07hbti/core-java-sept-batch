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

    }

}
