package collection;

import java.util.ArrayList;

public class Generics {
    public ArrayList<String> city(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Agra");
        //   list.add(56);
        list.add("delhi");
        list.add("Pune");
        list.add("Nagpur");
        return list;
    }


    public static void main(String[] args) {
        Generics obj=new Generics();
        ArrayList<String> list=obj.city();
        for(int i=0;i<list.size();i++){
            System.out.println("Cities using Generics only String "+list.get(i));}
        for(String var:list){
            System.out.println(var);
        }
        }

}
