package Collection_Variable;

import java.util.ArrayList;

public class DemoInteger {

    public ArrayList<Integer> studentData(){

        //TODO SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();

        ArrayList<Integer>marks= new ArrayList<Integer>();

        marks.add(23);
        marks.add(24);
        marks.add(25);

        return marks;



    }

    public static void main(String args[]){
         DemoInteger obj=new DemoInteger();
         ArrayList <Integer>marks=obj.studentData();

         for(Integer var:marks){
             System.out.println(""+var);
         }

    }
}
