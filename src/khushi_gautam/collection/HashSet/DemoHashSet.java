package khushi_gautam.collection.HashSet;

import java.util.HashSet;

public class DemoHashSet {
    public HashSet<Integer> HashSet(){
        //todo SYNTAX: HashSet <DataType> objName = new HashSet<> ();
        HashSet <Integer> num =new HashSet<>();
        num.add(23);
        num.add(21);
        num.add(43);
        num.add(61);
        num.add(21);
        num.add(43);
        num.add(61);
        num.add(51);
        return num;
    }
    public static void main(String[] args) {
        DemoHashSet obj = new DemoHashSet();
        HashSet<Integer> num = obj.HashSet();

        System.out.println("size of HashSet:"+ num.size());
        for (int var: num){
            System.out.println(var);
        }
    }
}
