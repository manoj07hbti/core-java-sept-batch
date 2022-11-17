package collection.hashSet;

import java.util.HashSet;

public class IntegerHashSet {
    public HashSet<Integer> digits() {
        HashSet<Integer> list = new HashSet<>();
        list.add(40);
        list.add(50);
        list.add(62);
        list.add(20);
        return list;
    }

    public static void main(String[] args) {
        IntegerHashSet obj=new IntegerHashSet();
        HashSet<Integer> list=obj.digits();
        for(int var:list)
        {System.out.println(var);}
    }
}
