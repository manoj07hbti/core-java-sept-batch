package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashing {

    public static void main(String[]args){
        //Todo=country(key),population(value)
        HashMap<String,Integer>map=new HashMap<>();

        // Todo =Insertion
        map.put("india",120);
        map.put("us",30);
        map.put("china",100);



        System.out.println(map);
         map.put("china",180);
         System.out.println(map);


        //Todo = search
        if(map.containsKey("india")){
            System.out.println("key is present in the map");
        }
        else {
            System.out.println("key is not present in map");
        }



    }


}
