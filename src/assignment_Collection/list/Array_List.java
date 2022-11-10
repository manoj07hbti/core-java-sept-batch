package assignment_Collection.list;

import java.util.ArrayList;

public class Array_List {

    //it will create Arraylist of String datatype

    //TODO SYNTAX: CollectionName < DataType> objName = new CollectionName<>();

    public ArrayList<String> createStringList(){
        ArrayList <String> doctor = new ArrayList<>();
        doctor.add("ortho");
        doctor.add("General phy");
        doctor.add("Diabetic");
       // doctor.add(33);
        doctor.add("ENT");

        return doctor;

    }


    public static void main(String[] args) {

        Array_List obj = new Array_List();
        ArrayList <String> doctor =obj.createStringList();

    }
}
