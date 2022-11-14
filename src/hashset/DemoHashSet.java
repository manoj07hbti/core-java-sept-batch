package hashset;

import java.util.HashSet;

public class DemoHashSet {

    public void HashSet(){

        HashSet <String> citis= new HashSet<>();
        citis.add("Pune");
        citis.add("Kanpur");
        citis.add("Agra");
        citis.add("Firozabad");

        for (String var:citis){
            System.out.println("Printing citis--"+var);
        }
    }

    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        obj.HashSet();

    }
}
