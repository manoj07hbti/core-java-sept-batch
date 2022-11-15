package assignment.assignmentHashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Sttring {

    public HashMap <String,Integer> createMap(){
    //Syntax : HashMap <datatype_key,datatype_value> varName = new HashMap<>();

        HashMap <String,Integer> studentInfo = new HashMap<>();

        //adding value to Map

        studentInfo.put("Ankit",12);
        studentInfo.put("Lovkesh",20);
        studentInfo.put("Kishan",21);

       //  System.out.println("Printing Map : " + studentInfo);


        return (studentInfo);
       // System.out.println("Printing HashMap : "+ studentInfo);
    }

    public static void main(String[] args) {
        HashMap_Sttring obj = new HashMap_Sttring();
        HashMap<String,Integer> studentInfo = obj.createMap();

        //get method : get (key);
        System.out.println( "Reading Map : " + studentInfo.get("Kishan"));
        System.out.println( "Reading Map : " + studentInfo.get("Ankit"));


        //how to print all element in Map

        Set <String> keys = studentInfo.keySet();

        for (String var : keys){

            System.out.println("Printing Keys In Map : " + studentInfo.get(var));
        }


    }
}
