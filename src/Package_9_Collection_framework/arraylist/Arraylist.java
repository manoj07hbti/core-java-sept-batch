package Package_9_Collection_framework.arraylist;

import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("Sachin");
        a1.add("Agra");
        a1.add("electrical engineer");
        a1.add(26);
        a1.add(5.11);
        a1.add("RBSETC");
        for (Object element: a1 ){
            System.out.println("by advanced for loop "+element);
        }
        for (int a=0;a<a1.size();a++ ){
            System.out.println("by for loop: "+a1.get(a)+" is at index "+a);
        }
        a1.remove(2);
        a1.remove(1);
        for (int a=0;a<a1.size();a++ ){
            System.out.println("by second for loop: "+a1.get(a)+" is at index "+a);
        }
    }
}
