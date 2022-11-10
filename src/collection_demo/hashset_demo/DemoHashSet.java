package collection_demo.hashset_demo;

import basics.Demo;

import java.util.HashSet;

public class DemoHashSet {

    public HashSet <String> createHashSet(){

        // SYNTAX  HashSet <DATATYPE> objName= new HashSet<> ();

        HashSet <String> cities= new HashSet<>();

        cities.add("Agra");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Jaipur");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Pune");

        return cities;
    }


    // Integer HashSet

    // Double HashSet

    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        HashSet <String> cities=  obj.createHashSet();

        System.out.println("Size of HashSet : "+cities.size());
        for (String var: cities){

            System.out.println("Printing cities : "+var);
        }

        for (String var: cities){

            if(var=="Delhi") {
                System.out.println("Delhi city found " + var);
            }
        }
    }

}
