package method_or_function;

public class Book {

    public void read(){

        System.out.println("THIS IS READ METHOD");

         String book = "COMPUTER ARCHITECTURE";
        System.out.println("Book is reading by PARTH : "  +book);

    }
    public void write(){

        System.out.println("THIS IS WRITE METHOD");

        String book = "COMPUTER ARCHITECTURE";
        System.out.println("Book written by PARTH : "  +book);
    }

    public static void main(String[] args) {

        Book obj = new Book();
        obj.read();
        obj.write();

    }
}
