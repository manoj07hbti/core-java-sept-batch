package collection;


import java.util.ArrayList;

public class Collection2 {
    public  void  storage(){

        ArrayList<String> list=new ArrayList<>();

        list.add("class");
        list.add("hai");
        list.add("kaam ki");
        list.add("hainye");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));


        for (String var :list){
            System.out.println("advance loop  "  +var);
        }






    }

    public static void main(String[] args) {
        Collection2 obj=new Collection2();
        obj.storage();
    }

}
