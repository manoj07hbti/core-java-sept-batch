package Collection_Variable;

import java.util.ArrayList;

public class dataDemo {

       public void animalNames(){
           ArrayList list= new ArrayList();

           list.add("Lion");
           list.add("cat");
           list.add("leoperd");
           list.add("Tiger");
           list.add("Dog");
           list.add("Panda");
           list.add("Camel");
           list.add("Dianasore");
           list.add("Buffalo");

           System.out.println("Reading list at 0 INDEX :"+list.get(0));
           System.out.println("Reading list at 2 INDEX :"+list.get(2));
           System.out.println("Reading list at 5 INDEX :"+list.get(5));
           System.out.println("Reading list at 3 INDEX :"+list.get(3));
           System.out.println("Reading list at 7 INDEX :"+list.get(7));
           System.out.println("Reading list at 1 INDEX :"+list.get(1));
           System.out.println("Reading list at 6 INDEX :"+list.get(6));
           System.out.println("Reading list at 2 INDEX :"+list.get(2));
           System.out.println("Reading list at 4 INDEX :"+list.get(4));



           for(int i=0; i <list.size(); i++){

               System.out.println("Printing list in loop : "+list.get(i)+ " at INDEX: "+i);
           }
           // Advanced for loop  for (DataType var : array/collection){CODE}

           for (Object var: list){

               System.out.println("Advanced for loop : "+var);
           }



       }


    public static void main(String[] args) {

        dataDemo obj= new dataDemo();
        obj.animalNames();

    }











}
