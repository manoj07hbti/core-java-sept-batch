package metthod;

public class Book {

    public void read(){
        System.out.println("this is read method");
        String book="The france revolution";
        int chapter=1;
        System.out.println("Book is read by me:"+book+"::");


    }
    public void write(){
        System.out.println("this is write method: ");
        String book= "The france revolution";
        int chapter=1;
        System.out.println("book is write by me:"+book+":");

    }



    public static void main(String[]args){
        Book obj=new Book();
        obj.read();
        obj.write();
    }
}
