package collection.hashMap;

import java.util.HashMap;

public class HashMap_String_String {

    // create method

    public HashMap createHashMap(){

        //Todo Syntax : HashMap<DataType_key, DataType_value> varName = new HashMap<>();
// key and value both are String

        HashMap <String,String>student = new HashMap<>();

        //  adding value to map (key,value);
        //  using put method

        student.put("Ram","Shyam");
        student.put("Raju","Vinod");
        student.put("Rajesh","Shubham");
        student.put("Sunil","Rakesh");

        return student;
    }

    // main method
    public static void main(String[] args) {

        // create object by the constructor

        // Todo Syntax : ClassName objName = new ClassName();
     HashMap_String_String obj = new HashMap_String_String();
        HashMap<String,String> student = obj.createHashMap();


        // using put method
        System.out.println(student.get("Ram"));
        System.out.println(student.get("Raju"));
        System.out.println(student.get("Rajesh"));
        System.out.println(student.get("Sunil"));


    }
}
