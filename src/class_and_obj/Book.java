package class_and_obj;

public class Book {

        String name="COMPUTER ORGANIZATION";
        int pages=1000;
        String  writer_Name = "P.RAJA";

        public static void main(String[] args) {
//TODO SYNTAX :  ClassName objName= new ClassName();

            class_and_obj.Book obj= new class_and_obj.Book(); // obj object created

            System.out.println("Printing object "+obj);

//TODO objName.property_name

            System.out.println("Printing book name "+obj.name);
            System.out.println("Printing book Pages "+obj.pages);
            System.out.println("Printing book Writer name "+obj.writer_Name);

        }
}
