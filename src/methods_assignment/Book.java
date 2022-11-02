package methods_assignment;

public class Book {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void Read(){
        System.out.println("This is a Read Method ");
    }

    public void Write(){
        System.out.println("This is a Write Method");
    }

    public static void main(String[] args){

        Book obj = new Book();
        obj.Read();
        obj.Write();
    }


}
