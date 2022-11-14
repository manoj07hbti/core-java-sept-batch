package collection.hashmap_demo;

import java.util.HashMap;
import java.util.Set;

public class DemoHashmap {

    public HashMap<Integer, String> createMap(){

        HashMap<Integer, String> chapter= new HashMap<>();

        chapter.put(1, "Number System");
        chapter.put(2, "Trignometry");
        chapter.put(3, "Algebra");
        chapter.put(4, "Geometry");
        chapter.put(null, "Nothing");
        chapter.put(2, "Intigration");

        return chapter;
    }

    public static void main(String[] args) {
        DemoHashmap obj=new DemoHashmap();

        HashMap<Integer, String> chapter=obj.createMap();

        System.out.println("Print chapter 2: "+chapter.get(2));
        System.out.println("Print chapter 3: "+chapter.get(3));

        Set<Integer> keys=chapter.keySet();

        for (Integer var: keys){
            System.out.println("Print all Hashmap by for loop: "+chapter.get(var));
        }

    }
}
