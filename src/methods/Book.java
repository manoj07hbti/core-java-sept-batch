package methods;

public class Book {
    public void read(){
        System.out.println("i read this book ");
    }

    public void learn(){
        System.out.println("I learn these books");
    }
    public static void main(String[] args) {
        Book obj=new Book();
        obj.read();
        obj.learn();
    }
}
