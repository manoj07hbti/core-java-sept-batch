package class_and_obj;

public class Demo_Person {

    String name;
    String company;
    int id;

    public Demo_Person(String name, String company, int id) {
        this.name = name;
        this.company = company;
        this.id = id;
    }

    public static void main(String[] args) {


        Demo_Person obj = new Demo_Person("PREETI", " HCL", 8787);

        System.out.println("name:  " +obj.name);
        System.out.println("company:  " +obj.company);
        System.out.println("id:  " +obj.id);

        Demo_Person obj1 = new Demo_Person("SINKU", " NIIT", 8729);

        System.out.println("name:  " +obj1.name);
        System.out.println("company:  " +obj1.company);
        System.out.println("id:  " +obj1.id);

        Demo_Person obj2 = new Demo_Person("YUVRAJ", " MARUTI", 8780);

        System.out.println("name:  " +obj2.name);
        System.out.println("company: " +obj2.company);
        System.out.println("id:  " +obj2.id);
    }
}
