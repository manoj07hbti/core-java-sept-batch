package assignment_Collection.hashset_demo;

import java.util.HashSet;

public class AssignmentHashSet {
    public HashSet <String> createHashSet(){
        //Syntex : Hashset <Datatype> objname = new hashset <>();

        HashSet <String> cities = new HashSet<>();
        cities.add("Agra");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Jaipur");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Jaipur");
        cities.add("Pune");
        cities.add("Jaipur");



        return cities;
    }

    public HashSet <Integer> createHashSetCode (){
        //Syntex : Hashset <Datatype> objname = new hashset <>();

        HashSet <Integer> code = new HashSet<>();
        code.add(05612);
        code.add(011);
        code.add(022);
        code.add(033);
        code.add(022);
        code.add(033);
        code.add(022);
        code.add(033);

        return code;

    }

    public static void main(String[] args) {
        AssignmentHashSet obj  = new AssignmentHashSet();
        HashSet <String> cities = obj.createHashSet();

        System.out.println("Size of HashSet : " + cities.size());
        for(String var: cities){
            System.out.println("Printing cities : " + var);
        }

        AssignmentHashSet obj1  = new AssignmentHashSet();
        HashSet <Integer> code= obj1 .createHashSetCode();
        for(Integer var: code){
            System.out.println("Printing cities code : " + var);
        }
    }
}
