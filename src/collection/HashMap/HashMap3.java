package collection.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap3 {

    public HashMap< Double , String> MapA(){

        //SYNTAX    HashMap <DATATYPE_key, DATATYPE_Value> varName= new HashMap<>();

        HashMap <Double , String> data = new HashMap<>();

        //adding value to map  put(key,value);

        data.put(1.01,"JAVA");
        data.put(1.02,"HTML");
        data.put(1.03,"Python");
        data.put(null,"SpringBoot");
        data.put(1.04,"JavaScript");
        data.put(1.05,"Ruby");

        return data;
    }

    public static void main(String[] args) {

        HashMap3 obj = new HashMap3();
        HashMap <Double , String> data = obj.MapA();

        System.out.println(data.get(1.01));
        System.out.println(data.get(1.06));
        System.out.println(data.get(null));

        Set<Double> keys = data.keySet();

        for( Double var : keys){

            System.out.println(data.get(var));
        }


    }


}
