package class_and_object;

public class Book {

    //properties

   String name="JAVA";
   int pages=939;
   String  wrtierName="James Gosling";

    public static void main(String[] args) {
//TODO SYNTAX :  ClassName objName= new ClassName();

        Book obj= new Book(); // obj object created

        System.out.println("Printing object "+obj);

//TODO objName.propertyname

        System.out.println("Printing book name "+obj.name);
        System.out.println("Printing book Pages "+obj.pages);
        System.out.println("Printing book Writer name "+obj.wrtierName);

        Book obj2= new Book();

        System.out.println("Printing book name "+obj2.name);
        System.out.println("Printing book Pages "+obj2.pages);
        System.out.println("Printing book Writer name "+obj2.wrtierName);
    }




}
