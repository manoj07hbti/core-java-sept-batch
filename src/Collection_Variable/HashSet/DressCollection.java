package Collection_Variable.HashSet;

import java.util.HashSet;

public class DressCollection {

    public HashSet<String> myDress(){

        HashSet <String>Dress= new HashSet<String>();
           Dress.add("Jeans");
           Dress.add("Trouser");
           Dress.add("T-Shirt");
           Dress.add("Jeans");
           Dress.add("Blazer");
           Dress.add("Jeans");
           return Dress;

    }
    public static void main(String args[]){
       DressCollection obj = new DressCollection();
        HashSet <String>Dress= obj.myDress();

        for( String var:Dress){
            System.out.println(""+var);
        }


    }
}
