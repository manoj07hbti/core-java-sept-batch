package Package_8_methods;

public class void_method_book {
    public void write(){
        System.out.println("Book is being written.");
    }
    public void read(){
        System.out.println("Book is being read.");
    }

    public static void main(String[] args) {
        void_method_book book = new void_method_book();
        book.write();
        book.read();
    }
}
