package collection_demo.hash_map_demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class DemoTreeMap {

    public static void main(String[] args) {

        HashMap<Integer, String> map= new HashMap<>();

        map.put(2,"Java");
        map.put(1,"Java 8");
        map.put(4,"Spring");
        map.put(3,"Spring Boot");
        map.put(33,"Microservices");


        System.out.println(map);


        TreeMap <Integer,String> treeMap= new TreeMap<>();

        treeMap.put(2,"Java");
        treeMap.put(1,"Java 8");
        treeMap.put(4,"Spring");
        treeMap.put(3,"Spring Boot");
        treeMap.put(33,"Microservices");

        System.out.println("Using Tree Map : "+treeMap);

        TreeMap <String,String> stringMap= new TreeMap<>();

        stringMap.put("A","Java");
        stringMap.put("C","CLoud");
        stringMap.put("B","Spring");
        stringMap.put("E","Microservices");

        System.out.println(stringMap);

        LinkedHashMap<String,String> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put("A","Java");
        linkedHashMap.put("C","Java 8");
        linkedHashMap.put("B","Spring");

        System.out.println("Linked map "+linkedHashMap);


    }
}
