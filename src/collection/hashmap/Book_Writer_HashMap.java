package collection.hashmap;

import java.util.HashMap;
import java.util.Set;

public class Book_Writer_HashMap {


    public HashMap<String, String> bookMap(){

        HashMap<String, String> Book = new HashMap<>();

        Book.put("computer organization", "P.RAJA");
        Book.put("Hindi", "R. PANDEY");
        Book.put("Math" , "C.RAWAT" );
        Book.put("computer organization", "P.RAJA");


        return Book;

    }

    public static void main(String[] args) {

        Book_Writer_HashMap obj = new Book_Writer_HashMap();

        HashMap<String, String> Book= obj.bookMap();

        System.out.println("reading key data : "   +Book.get("Math"));

        System.out.println("reading key data  : "   +Book.get("Hindi"));


        //print all elements of map

        Set<String> keys = Book.keySet();

        for(String var : keys){

            System.out.println("Print map  : "+Book.get(var));
        }

    }
}
