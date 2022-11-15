package collection;

import java.util.HashMap;
import java.util.Set;


public class Demo_Hash_Map {
    public HashMap<Integer, String> createMap() {
        HashMap<Integer,String> papa=new HashMap();

        papa.put(11,"agra");
        papa.put(12,"delhi");
        papa.put(21,"kanpur");


        System.out.println(papa.keySet());
        System.out.println(papa.keySet());

        return papa;





    }

    public static void main(String[] args) {
        Demo_Hash_Map obj=new Demo_Hash_Map();
        HashMap<Integer,String> papa= obj.createMap();

        Set<Integer> keys=papa.keySet();


        for (Integer var : keys){
            System.out.println(papa.get(var));
        }





    }

}
