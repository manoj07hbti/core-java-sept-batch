package methods_function;

public class Book {
    // Todo : properties
    String name;
    int page;
    String writerName;


 /* todo    Member function or method -- capabilities
        Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/
    // Todo : capabilities
    // read
    // write


    // Todo STEP 1: read
   //  Syntax : access_specifier return_type  method_name (parameter) {CODE..}
                public void readMethod() {
               System.out.println("This is Read Method....");
                                     }

    // Todo Step2 : write
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
                public void writeMethod(){
                  System.out.println("This is Write Method....");
                       }

    public static void main(String[] args) {
        //Todo Syntax :  ClassName  objectName = new ClassName();
                         Book book = new Book();

                    // Create object
                   // objName.MethodName();
                    book.readMethod();    // objName.MethodName(); --> it is calling eat Method
                    book.writeMethod();



    }
}
