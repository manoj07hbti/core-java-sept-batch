package khushi_gautam.collection.Hash_Map;

import java.util.HashMap;
import java.util.Set;

public class Double_HashMap {
    public HashMap<Double,Integer> Hashmap() {
        //todo SYNTAX: HashMap (datatype_key,datatype_value) varName = new HashMap();
        HashMap<Double,Integer> khushi=new HashMap<>();

        // todo In map we use put(key,value) method for add
        khushi.put(1.1,10);
        khushi.put(1.2,20);
        khushi.put(1.3,30);
        khushi.put(1.4,40);
        khushi.put(1.5,50);

        //todo without any method
        System.out.println("print map");
        System.out.println(khushi);

        System.out.println(" ");

        return khushi;
    }

    public static void main(String[] args) {
        Double_HashMap obj= new Double_HashMap();
        HashMap<Double,Integer> khushi= obj.Hashmap();
        System.out.println("printing Map in loop");

        // todo how to print all elements of map
        Set<Double>keys= khushi.keySet();
        for (Double var:keys){
            System.out.println(khushi.get(var));
        }

        System.out.println(" ");

        //todo get method:get(key)
        System.out.println("Print read map");
        System.out.println(khushi.get(1.2));
        System.out.println(khushi.get(1.5));

    }
}
