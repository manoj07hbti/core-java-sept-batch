package Package_10_Collection_framework_map;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_String_string {
    public  HashMap<String, String> information() {
    HashMap<String, String> info = new HashMap<>();
    info.put("name", "Sachin");
    info.put("qualification", "B.Tech");
    info.put("branch", "Electrical");
    info.put("city", "Agra");
    return info;
}

    public static void main(String[] args) {
        Hashmap_String_string obj = new Hashmap_String_string();
        HashMap<String, String> info = obj.information();
        Set<String> keys = info.keySet();
        for (String elements : keys){
            System.out.println("key: "+elements +" has the vale: "+ info.get(elements));
        }
    }
}
