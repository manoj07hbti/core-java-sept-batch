package khushi_gautam.collection;

import java.util.ArrayList;

public class collection_firstmethod {
    public void  arrayList(){
        String a ="Roopa";
        int b = 24;
        Float c = 1.2f;
        short d = 87;
        char e = 'R';
        double f = 4.25d;
        byte g = 34;
        long h = 9999999999999L;
        boolean j = true;


        //todo add method
        ArrayList list = new ArrayList();
        list.add("Roopa");                                  // 0 INDEX
        list.add(24);                                       // 1 INDEX
        list.add(1.2f);                                     // 2 INDEX
        list.add(87);                                       // 3 INDEX
        list.add('R');                                      // 4 INDEX
        list.add(4.25d);                                    // 5 INDEX
        list.add(34);                                       // 6 INDEX
        list.add(9999999999999L);                           // 7 INDEX
        list.add(true);                                     // 8 INDEX
        list.add("SWETA");                                  // 9 INDEX
        list.add("AGRA");                                   // 10 INDEX

        System.out.println(" ");

        //todo get method
        System.out.println("reading list with index");
        System.out.println(list.get(3));
        System.out.println(list.get(0));
        System.out.println(list.get(7));

        System.out.println(" ");

        //todo get index method
        System.out.println("get index");
        System.out.println(list.indexOf("AGRA"));
        System.out.println(list.indexOf(24));

        System.out.println(" ");

        // todo size method with for loop
        System.out.println("Printing list with for loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println(" ");

        // todo Advanced for loop for (Datatype var: array,collection) {CODE}
        System.out.println("Advanced for loop");
        for (Object var: list){
            System.out.println(var);
        }

        System.out.println(" ");

        // todo remove method
        list.remove(2);
        list.remove(8);
        list.remove(5);
        System.out.println("After remove index");
        for (Object var: list) {
            System.out.println(var);
        }
    }

    public static void main(String[] args) {
        // todo syntax: collectionName ObjestName = new collectionName();
        collection_firstmethod obj = new collection_firstmethod();
        obj.arrayList();
    }
}
