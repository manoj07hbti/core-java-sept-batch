package collection;

import java.util.ArrayList;

public class DemoCollection {
    public void countryInformation(){

        ArrayList list=new ArrayList();
        list.add("India");
        list.add("Bangladesh");
        list.add("China");
        list.add("Russia");
        list.add("Australia");
        list.add("Pakistan");
        list.add("Nepal");
        list.add("Spain");
        list.add("12345");
        list.add("12.45");

        System.out.println("Reading list at 0 Index= "+list.get(0));
        System.out.println("Reading list at 2 Index= "+list.get(2));
        System.out.println("Reading list at 4 Index= "+list.get(4));
        System.out.println("Reading list at 6 Index= "+list.get(6));

        for (int i=0; i<list.size(); i++){
            System.out.println("Print for loop= "+list.get(i));
        }

        //todo advance for loop
        for (Object var:list){
            System.out.println("Print advance for loop= "+var);
        }

        list.remove(1);

        for (Object var:list){
            System.out.println("Remove advance for loop= "+var);
        }
        System.out.println("Print after remove= "+list.get(1));
    }

    public static void main(String[] args) {
        DemoCollection obj=new DemoCollection();
        obj.countryInformation();
    }
}
