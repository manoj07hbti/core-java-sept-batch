package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {


    public static void main(String[] args) {


        HashSet<Integer> rollNo = new HashSet<>();
        rollNo.add(1);
        rollNo.add(2);
        rollNo.add(3);
        rollNo.add(4);
        rollNo.add(5);
        rollNo.add(1);

        System.out.println("Print rollNo  : " + rollNo);


        //search contains

        if (rollNo.contains(1)) {
            System.out.println("contains rollno");
        }

        if (!rollNo.contains(6)) {
            System.out.println("does not contain rollno");
        }


        if (rollNo.contains(2)) {
            System.out.println(" contains rollno");

        }

        //delete

        rollNo.remove(1);
        if (rollNo.contains(1)) {
            System.out.println("we deleted 1");
        }

        System.out.println("Print roll no after remove : " + rollNo);

        //size

        System.out.println("size of set : " + rollNo.size());

        //set

        System.out.println(rollNo);

        //Iterator======elements can be in any order

        Iterator it = rollNo.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }
    }
}
