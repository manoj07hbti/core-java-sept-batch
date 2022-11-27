package Practice_Set;


class Library{
    String[]book;
    int no_of_book;

    Library(){
        this.book=new String[100];
        this.no_of_book=0;

    }
    void addBook(String book){
        this.book[no_of_book]=book;
        no_of_book++;
        System.out.println(book+"has been added!");
    }

    void ShowAvailableBook(){
        System.out.println("Available");
        for (String book:this.book){
         if (book==null){
             continue;
         }
            System.out.println(""+book);
        }
    }
    void issueBook(String book){
        for (int i=0;i<this.book.length;i++)
            if (this.book[i].equals(book)) {
                System.out.println("the book been issue! ");
                this.book[i] = null;
                return;
            }
        System.out.println("this book is not exit");

    }
       void returnBook(String book){
        addBook(book);
       }

}


public class Library_System {
    public static void main(String[] args){
        // Todo =Method :addBook ,issueBook,returnBook,ShowAvailableBooks
        // Todo=properties:Array to store the available book,
        // Todo=Array to Store the issued Book



   Library centerLibrary=new Library();
   centerLibrary.addBook("Think and grow Rich");
   centerLibrary.addBook("English Part1:");
   centerLibrary.addBook("History part 2:");
   centerLibrary.addBook("Hindi part 1:");
   centerLibrary.ShowAvailableBook();


       centerLibrary.issueBook("Hindi part 1:");
        centerLibrary.ShowAvailableBook();

        centerLibrary.returnBook("Hindi Part2:");
        centerLibrary.ShowAvailableBook();
    }


}


