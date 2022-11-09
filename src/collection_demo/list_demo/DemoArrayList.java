package collection_demo.list_demo;

import java.util.ArrayList;

public class DemoArrayList {

   // it will create ArrayList of String datatype
//TODO SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();

   public ArrayList<String> createStringList(){

       ArrayList <String> course= new ArrayList<>();
       course.add("Java");
       course.add("Spring");
       course.add("Spring Boot");
       //course.add(33);  we can not add any other data
       course.add("CLoud");

       return course;
   }

   // int ArrayList       ArrayList <Integer>
   // decimal arrayList   ArrayList <Double>


    public static void main(String[] args) {

       DemoArrayList obj= new DemoArrayList();
       ArrayList <String> course=obj.createStringList();

       for(int i=0; i<course.size(); i++){

           System.out.println("Normal for Loop "+course.get(i));
       }

       for(String var: course){

           System.out.println("Printing ArrayList in loop "+var);
       }

    }
}
