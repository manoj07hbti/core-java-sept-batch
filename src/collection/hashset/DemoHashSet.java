package collection.hashset;

import java.util.HashSet;

public class DemoHashSet {

    public HashSet<String> stringHashSet(){

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

    public HashSet<Integer> IntHashSet(){

        HashSet<Integer> num = new HashSet<>();

        num.add(8);
        num.add(22);
        num.add(789);
        num.add(8);
        num.add(93748);
        num.add(22);
        num.add(789);
        num.add(93748);

        return num;
    }

    // Double HashSet

    public HashSet<Double> DoubleHashSet(){

        HashSet<Double> digits = new HashSet<>();

        digits.add(23.23);
        digits.add(56.90);
        digits.add(33.29);
        digits.add(56.78);
        digits.add(23.23);
        digits.add(23.23);
        digits.add(56.78);

        return digits;

    }

    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        HashSet <String> cities=  obj.stringHashSet();

        System.out.println("Size of HashSet : "+cities.size());
        for (String var: cities){

            System.out.println("Printing cities : "+var);
        }

        HashSet <Integer> num = obj.IntHashSet();

        for( Integer var : num){
            System.out.println("Printing Numbers : " +var);
        }

        HashSet<Double> digits = obj.DoubleHashSet();

        for( Double var : digits){

            System.out.println("printing Digits : " +var);
        }
    }


}
