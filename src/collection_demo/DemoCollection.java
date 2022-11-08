package collection_demo;

import java.util.ArrayList;

public class DemoCollection {


    public void storeInformation(){

       String city1="Agra";
       String city2="Delhi";
       String city3="Jaipur";

       //TODO SYNTAX :  CollectionName objName= new CollectionName();

        ArrayList list= new ArrayList();
        list.add("Agra");  // 0 INDEX
        list.add("Delhi"); // 1 INDEX
        list.add("Jaipur");// 2 INDEX
        list.add("Pune");//   3 INDEX
        list.add(33); //      4 INDEX
        list.add(3242.7);//   5 INDEX

        System.out.println("Reading list at 0 INDEX :"+list.get(0));
        System.out.println("Reading list at 3 INDEX :"+list.get(3));
        System.out.println("Reading list at 1 INDEX :"+list.get(1));
        System.out.println("Reading list at 4 INDEX :"+list.get(4));
        System.out.println("Reading list at 5 INDEX :"+list.get(5));


        for(int i=0; i <list.size(); i++){

            System.out.println("Printing list in loop : "+list.get(i));
        }

        // Advanced for loop  for (DataType var : array/collection){CODE}

        for (Object var: list){

            System.out.println("Advanced for loop : "+var);
        }

        list.remove(2);

        for (Object var: list){

            System.out.println("AFTER REMOVE Advanced for loop : "+var);

        }
        System.out.println("Reading list at 3 INDEX :"+list.get(3));
    }




    public static void main(String[] args) {

        DemoCollection obj= new DemoCollection();
        obj.storeInformation();

    }
}
