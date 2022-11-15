package collection.hashMap;

import java.util.HashMap;

public class HashMap_Double_String {
    // create method

    public HashMap createHashMap() {

        //Todo Syntax : HashMap<DataType_key, DataType_value> varName = new HashMap<>();
// key and value both are String

        HashMap<Double, String> price = new HashMap<>();

        //  adding value to map (key,value);
        //  using put method

        price.put(38.50, "Sugar");
        price.put(880.30, "Ghee");

        return price;
    }

    // main method
    public static void main(String[] args) {

        // create object by the constructor

        // Todo Syntax : ClassName objName = new ClassName();
        HashMap_Double_String obj = new HashMap_Double_String();
        HashMap<Double, String> price = obj.createHashMap();


        // using put method
        System.out.println(price.get(38.50));
        System.out.println(price.get(880.30));

    }
}