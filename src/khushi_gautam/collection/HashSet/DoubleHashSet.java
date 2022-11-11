package khushi_gautam.collection.HashSet;

import java.util.HashSet;

public class DoubleHashSet {
    public  HashSet<Double> HashSet(){
        HashSet <Double> d = new HashSet<>();
        d.add(34.2);
        d.add(23.1);
        d.add(49.8);
        d.add(12.5);
        return d;
    }

    public static void main(String[] args) {
        DoubleHashSet obj= new DoubleHashSet();
        HashSet <Double> d= obj.HashSet();

        System.out.println("size of HashSet:"+ d.size());
        for (double var: d){
            System.out.println(var);
        }
    }
}
