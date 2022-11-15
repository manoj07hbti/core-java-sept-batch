package Package_10_Collection_framework_map;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_double_string {
    public  HashMap<Double, String> chapters(){
        HashMap<Double, String> chapter = new HashMap<>();
        chapter.put(4.1,"Polymorphism");
        chapter.put(4.2,"Encapsulation");
        chapter.put(4.3,"Abstract");
        chapter.put(4.4,"Inheritance");
            return chapter;
    }
    public static void main(String[] args) {
        Hashmap_double_string obj = new Hashmap_double_string();
        HashMap<Double, String> chapter = obj.chapters();
        Set<Double> keys = chapter.keySet();
        for (Double elements: keys ){
            System.out.println("chapter number: " +elements + " "+chapter.get(elements));
        }
    }
}
