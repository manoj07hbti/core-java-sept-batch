package collection;

import java.util.ArrayList;

public class Collection_demo1 {

    public void storeImformation(){

        String city1="agra";
        String city2="kashi";
        String city3="banaras";

        //TODO SYNTAX :  CollectionName objName= new CollectionName();
        ArrayList list = new ArrayList();
        list.add("agra");
        list.add("kashi");
        list.add("banaras");
        list.add("ujjain");
        list.add("ramlila");
        list.add(123);
        list.add(121);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(" ");

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(" ");

        for (Object var : list){
            System.out.println("this is advance loop  "  +var);
        }


    }

    public static void main(String[] args) {
        Collection_demo1 obj =new Collection_demo1();
        obj.storeImformation();

    }




}
