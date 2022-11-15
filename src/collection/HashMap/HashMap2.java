package collection.HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

    public HashMap< Double , Integer> MapA(){

        //SYNTAX    HashMap <DATATYPE_key, DATATYPE_Value> varName= new HashMap<>();

        HashMap <Double , Integer> data = new HashMap<>();
        //adding value to map  put(key,value);

        data.put(1.11,111);
        data.put(2.22,222);
        data.put(3.33,333);
        data.put(4.44,444);
        data.put(5.55,555);
        data.put(null,666);
        data.put(4.44,445);

        return data;
    }

    public static void main(String[] args) {

        HashMap2 obj = new HashMap2();
        HashMap <Double , Integer> data = obj.MapA();

        System.out.println(data.get(1.11));
        System.out.println(data.get(2.22));
        System.out.println(data.get(null));

        Set<Double> keys = data.keySet();

        for( Double var : keys){

            System.out.println(data.get(var));
        }


    }


}
