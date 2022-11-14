package Collection_Variable.HashSet;

import java.util.HashSet;

public class PracticeHashSet {

    public HashSet<String> ItemHashSet() {

        // SYNTAX  HashSet <DATATYPE> objName= new HashSet<> ();

        HashSet<String> Items = new HashSet<>();

        Items.add("Allo Tikki");
        Items.add("Pizza");
        Items.add("Burger");
        Items.add("Pasta");
        Items.add("Allo Tikki");
        Items.add("Pizza");
        Items.add("Burger");
        Items.add("Pasta");

        return Items;
    }

    public static void main(String args[]) {

        PracticeHashSet obj = new PracticeHashSet();
        HashSet<String> Items = obj.ItemHashSet();

        System.out.println("items of HashSet : " + Items.size());

        for (String var : Items) {

            System.out.println("Printing Items : " + var);
        }

        for (String var : Items) {

            if (var == "Pizza") {
                System.out.println("pizza Item found " + var);
            }


        }


    }
}
