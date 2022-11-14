package khushi_gautam.collection.Hash_Map;

import java.util.HashMap;
import java.util.Set;

public class String_HashMap {
    public HashMap<String,String> HashMap() {
        //todo SYNTAX: HashMap (datatype_key,datatype_value) varName = new HashMap();
        HashMap<String, String> District = new HashMap<>();

        // todo In map we use put(key,value) method for add

        District.put("U.P", "Aligarh");
        District.put("Rajasthan", "Jodhpur");
        District.put("Maharashtra", "Nashik");
        District.put("M.P", "Anuppur");
        //todo normal
        System.out.println("Printing Map");
        System.out.println(District);
        System.out.println(" ");

        return District;
    }

    public static void main(String[] args) {
        String_HashMap obj = new String_HashMap();
        HashMap<String,String>District=obj.HashMap();
        System.out.println("Reading Map");

        //todo get method:get(key)
        System.out.println(District.get("U.P"));
        System.out.println(District.get("M.P"));
        System.out.println(" ");

        //todo how to print all element of map
        Set<String> keys= District.keySet();
        System.out.println("printing map in loop");
        for (String var:keys){
            System.out.println(District.get(var));
        }
    }
}
