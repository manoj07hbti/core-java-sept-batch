package collection.treemap_linkedhashmap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreemapAndLinkedhashmap {

    public static void main(String[] args) {
// todo treemap print with sequence of 123 anf abcd
        TreeMap<Integer, String> maptree = new TreeMap<>();

        maptree.put(2, "Vicky");
        maptree.put(1, "Lucky");
        maptree.put(4, "Sunny");
        maptree.put(3, "Hunny");
        maptree.put(33, "Ashu");

        System.out.println("Print with TreeMap: "+maptree);
// todo linkedhashmap print with sequence
        LinkedHashMap<Integer, String> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put(2, "Vicky");
        linkedHashMap.put(1, "Lucky");
        linkedHashMap.put(4, "Sunny");
        linkedHashMap.put(3, "Hunny");
        linkedHashMap.put(33, "Ashu");

        System.out.println("Print with LinkedHashmap: "+linkedHashMap);
    }
}