package method_and_function1;

public class Book {

    String writer_name;
    int pages;
    int price;
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void writer_name(){

        System.out.println("This is writer name method");
    }
    public void pages(){
        System.out.println("This is pages method");
    }
    public void price(){
        System.out.println("This is price method");
    }

    public static void main(String[] args) {
        Book obj=new Book();// OBJECT CREATED
        obj.writer_name();// call writer_name method
        obj.pages(); // call pages method
        obj.price(); // call price method
    }
}



