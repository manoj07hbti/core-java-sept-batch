package methods;

import java.util.Scanner;

public class M_Book {
    String book;
    Scanner bk = new Scanner(System.in);

    public void readBk(){
        System.out.println("Enter The Book Name :");
        String book = bk.nextLine();
        if(book.contains("MELUHA")){
            System.out.println("You MUST read MELUHA");
        }
        else
            System.out.println("Book is not available");
    }

    public void writeBk(){
        System.out.println("Enter The Author Name :");
        String book = bk.nextLine();
        if(book.contains("Amish Tripathi"))
        {
        System.out.println("Author Write MELUHA");
        }
           else
            System.out.println("Author not Write MELUHA");
    }
    public static void main(String[] args) {

        M_Book obj = new M_Book();
        obj.readBk();
        obj.writeBk();

    }
}
