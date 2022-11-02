package assignment_Method;

public class Book {

    String bookRead;
    String bookWrite;

    public void read(){
        System.out.println("This is a Read Method");
    }

    public void write(){
        System.out.println("This is Write Method");
    }

    public static void main(String[] args) {
        Book book = new Book(); //Object Created
        book.read();            //objName.MethodName(); --> it is calling Read Method
        book.write();           // Calling Write Method
    }
}
