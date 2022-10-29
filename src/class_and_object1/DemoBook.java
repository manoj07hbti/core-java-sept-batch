package class_and_object1;

public class DemoBook {
    String name = "English Speaking book";
    int pages=99;
    String writer_name="Suraj";

    public static void main(String[] args) {

        DemoBook obj = new DemoBook();
        System.out.println("Book name--"+obj.name);
        System.out.println("Book Pages--"+obj.pages);
        System.out.println("Book Writer--"+obj.writer_name);
    }
}
