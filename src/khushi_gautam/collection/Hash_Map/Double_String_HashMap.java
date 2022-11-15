package khushi_gautam.collection.Hash_Map;

import java.util.HashMap;
import java.util.Set;

public class Double_String_HashMap {
    public HashMap<Double,String> HashMap(){

        //todo SYNTAX: Hash HashMap<Double,String> data=new HashMap<>();
        HashMap<Double,String> data=new HashMap<>();

        // In map we use put(key,value) method for add
        data.put(1.1,"khushi");
        data.put(1.2,"Rupali");
        data.put(1.3,"Esha");
        data.put(1.4,"karan");

        //todo print without any method
        System.out.println("print Map");
        System.out.println(data);
        System.out.println(" ");

        return data;
    }
    public static void main(String[] args) {
        Double_String_HashMap obj = new Double_String_HashMap();
        HashMap<Double,String> data= obj.HashMap();

        //todo how to print all elements of map
        System.out.println("print Map in loop");
        Set<Double> keys = data.keySet();
        for (Double var:keys){
            System.out.println(data.get(var));
        }

        System.out.println(" ");

        //todo get method: get(keys)
        System.out.println("Read map");
        System.out.println(data.get(1.4));
        System.out.println(data.get(1.2));
    }
}
