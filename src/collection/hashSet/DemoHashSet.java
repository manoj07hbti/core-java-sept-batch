package collection.hashSet;

import java.util.HashSet;

public class DemoHashSet {
    public void createHashSet() {
        HashSet<String> list = new HashSet<>();
        list.add("AGRA");
        list.add("DELHI");
        list.add("KANPUR");
        list.add("PUNE");
        list.add("AGRA");
        list.add("NAGPUR");
        System.out.println(list.size());
        for(String var:list){
            System.out.println("HASH SET CITY NAME :"+var);
        }
    }

    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();
        obj.createHashSet();
    }
}
