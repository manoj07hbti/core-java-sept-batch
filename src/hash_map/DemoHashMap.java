package hash_map;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {


    public HashMap<Integer,String> createMap(){

        //:Syntax-- HashMap<Data type, Key and value> var value= new HashMap<>();

        HashMap<Integer,String> course = new HashMap<>();
        course.put(1,"Core Java");
        course.put(2,"Spring Boot");
        course.put(3,"Java 8");

       //// System.out.println( " Printing HashMap--"+ course);

        return course;

    }

    public static void main(String[] args) {

        DemoHashMap obj =new DemoHashMap();
        HashMap<Integer,String>course =obj.createMap();

        //get method: get (key);

        System.out.println("Reading Map--"+course.get(2));

        Set<Integer >keys=course.keySet();

        for (Integer var :keys){

            System.out.println("Printing "+course.get(var));
        }


    }
}
