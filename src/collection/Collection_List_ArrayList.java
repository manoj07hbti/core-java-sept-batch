package collection;

import java.util.ArrayList;

public class Collection_List_ArrayList {


    public void StudentRecord() {

        //TODO SYNTAX :  CollectionName objName= new CollectionName();

        ArrayList list = new ArrayList();

        list.add("Shivani");                                              // 0 INDEX
        list.add("Agra");                                                 // 1 INDEX
        list.add("Course-M.Tech");                                        // 2 INDEX
        list.add("Branch- CS");                                           // 3 INDEX
        list.add("HOD name- Dr.P.C. Sharma");                             // 4 INDEX
        list.add("Division- 1st");                                        // 5 INDEX
        list.add("College- Indraprastha Engineering College");            // 6 INDEX
        list.add("Roll no- 2362364723");                                  // 7  INDEX
        list.add("Marks- 76%");                                           // 8 INDEX
        list.add(283.23);                                                 // 9 INDEX
        list.add(2131283912381293l);                                      // 10 INDEX



        System.out.println("Reading list at 0 INDEX :" + list.get(1));
        System.out.println("Reading list at 3 INDEX :" + list.get(4));
        System.out.println("Reading list at 1 INDEX :" + list.get(6));
        System.out.println("Reading list at 4 INDEX :" + list.get(7));
        System.out.println("Reading list at 5 INDEX :" + list.get(0));
        System.out.println("Reading list at 6 INDEX :" + list.get(8));
        System.out.println("Reading list at 7 INDEX :" + list.get(2));
        System.out.println("Reading list at 8 INDEX :" + list.get(9));


        //Printing list using Loop

          for(int i = 0; i< list.size(); i++){

              System.out.println(" Student Record in list: "  +list.get(i));
          }


        // Advanced for loop  for (DataType var : array/collection)


        for (Object var : list){

            System.out.println("Advanced for loop : " + var);
        }

        //remove any index

        list.remove(2);
        list.remove(5);    //after rearrange the index....next index will remove


        for (Object var : list) {

            System.out.println("AFTER REMOVE ADVANCE LOOP : " + var);

        }

        //for reading list at any index
       System.out.println("Reading list at 3 INDEX :" + list.get(3));
        System.out.println("Reading list at 2 INDEX :" + list.get(2));

    }


    public static void main(String[] args) {

        Collection_List_ArrayList obj = new Collection_List_ArrayList();
        obj.StudentRecord();
    }
}
