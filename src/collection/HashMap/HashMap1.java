package collection.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap1 {

    public HashMap< String , String> MapA(){

        //SYNTAX    HashMap <DATATYPE_key, DATATYPE_Value> varName= new HashMap<>();

        HashMap <String , String> data = new HashMap<>();
        //adding value to map  put(key,value);

        data.put("J","JAVA");
        data.put(null,"SpringBoot");
        data.put("H","HTML");
        data.put("P","Python");
        data.put("JS","JavaScript");
        data.put("R","Ruby");
        data.put("H","Spring");

        return data;
    }

    public static void main(String[] args) {

        HashMap1 obj = new HashMap1();
        HashMap <String , String> data = obj.MapA();

        System.out.println(data.get("J"));
        System.out.println(data.get(null));
        System.out.println(data.get("P"));

        Set<String> keys = data.keySet();

        for( String var : keys){

            System.out.println(data.get(var));
        }


    }

}
