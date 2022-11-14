package collection.hashmap_demo;

import java.util.HashMap;
import java.util.Set;

public class HashmapAssign {

    public HashMap<String, String> createStringHashmap(){
        HashMap<String, String> stringMap=new HashMap<>();


        stringMap.put("Lucky", "Nikhlesh");
        stringMap.put("Vicky", "Vivek");
        stringMap.put("Hunny", "Avinash");
        stringMap.put("Sunny", "Shubham");

        return stringMap;
    }

    public static void main(String[] args) {
        HashmapAssign obj=new HashmapAssign();
        HashMap<String, String> stringMap=obj.createStringHashmap();

        System.out.println("Print Lucky real Name: "+stringMap.get("Lucky"));
        System.out.println("Print Hunny real Name: "+stringMap.get("Hunny"));

        Set<String> key=stringMap.keySet();

        for (String var: key){
            System.out.println("Print all with advance for loop: "+stringMap.get(var));
        }
    }
}
