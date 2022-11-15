package collection.hashMap;

import java.util.HashMap;

public class HashMap_Double_Integer {

    // create method

    public HashMap createHashMap(){

        //Todo Syntax : HashMap<DataType_key, DataType_value> varName = new HashMap<>();
// key is Double and value ie Integer

        HashMap <Double,Integer>marks = new HashMap<>();

        //  adding value to map (key,value);
        //  using put method

        marks.put(59.50,1);
        marks.put(68.25,2);
        marks.put(80.50,3);
        marks.put(55.05,4);



        return marks;
    }

    // main method
    public static void main(String[] args) {

        // create object by the constructor

        // Todo Syntax : ClassName objName = new ClassName();
        HashMap_Double_Integer obj = new HashMap_Double_Integer();
        HashMap<Double, Integer> marks = obj.createHashMap();


        // using put method
        System.out.println(marks.get(59.50));
        System.out.println(marks.get(68.25));
        System.out.println(marks.get(80.50));
        System.out.println(marks.get(55.05));

    }

    }
