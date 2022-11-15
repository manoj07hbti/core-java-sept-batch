package Package_10_Collection_framework_map;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_double_integer {
    public HashMap<Double,Integer> Exam(){
        HashMap<Double,Integer> maxMarks = new HashMap<>();
        maxMarks.put(1.1,20);
        maxMarks.put(1.2,25);
        maxMarks.put(1.3,30);
        maxMarks.put(1.4,25);
        return maxMarks;
    }

    public static void main(String[] args) {
        Hashmap_double_integer obj = new Hashmap_double_integer();
        HashMap<Double,Integer> maxMarks = obj.Exam();
        Set<Double> keys = maxMarks.keySet();
        for (double elements: keys){
            System.out.println("Chapter: "+elements+" max marks: " +maxMarks.get(elements));
        }
    }
}
