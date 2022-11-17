package collection.hashSet;

import java.util.HashSet;

public class DoubleHashSet {
    public HashSet<Double> decimal() {
        HashSet<Double> list = new HashSet<>();
        list.add(23.155);
        list.add(24.14);
        list.add(9.36);
        list.add(14.36);
        list.add(24.14);
        list.add(9.36);
        list.add(14.36);
        list.add(24.14);
        list.add(9.36);
        list.add(14.36);
        return list;
    }

    public static void main(String[] args) {
        DoubleHashSet obj = new DoubleHashSet();
        HashSet<Double> list = obj.decimal();
        System.out.println("size is only:"+list.size());
        for (double var : list) {
            System.out.println(var);

        }
    }

}

