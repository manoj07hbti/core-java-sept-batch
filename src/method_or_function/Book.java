package method_or_function;

public class Book {

    public void read(){
        System.out.println("This is read method");
    }
    public void write(){
        System.out.println("This is write method");
    }

    public static void main(String[] args) {
        Book obj=new Book();
        obj.read();
        obj.write();
    }
}
