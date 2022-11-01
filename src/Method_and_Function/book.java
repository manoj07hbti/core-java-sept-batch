package Method_and_Function;

public class book {
     String book;
     String name;
     int number;

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void bookMethod(){
         System.out.println("This is a bookMethod");
    }

    public void readMethod(){
        System.out.println("This is a readMethod");
    }

    public void writeMethod(){

        System.out.println("This is a writeMethod");
    }

    public static void main(String args[]){

        book obj= new book();
        obj.bookMethod();

   obj.readMethod();
   obj.writeMethod();

    }




}
