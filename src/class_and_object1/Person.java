package class_and_object1;

public class Person {
    String name="Jaydeep singh";
    int age =27;
    double sallary=21232.23;

    public Person(String name, int age, double sallery) {
        this.name = name;
        this.age = age;
        this.sallary = sallery;
    }

    public static void main(String[] args) {
        Person obj =new Person("Jaydeep singh",27,21232.23);
        Person obj1 =new Person("Akash Kumar",22,21876.23);
        Person obj2 =new Person("Rohit ",22,344535.23);
        System.out.println("Name--"+obj.name +"Age:--"+obj.age+ "\n"+"Sallary--"+obj.sallary);
        System.out.println("Name--"+obj1.name +"Age:--"+obj1.age+ "\n"+"Sallary--"+obj1.sallary);
        System.out.println("Name--"+obj2.name +"Age:--"+obj2.age+  "\n"+ "Sallary--"+obj2.sallary);
    }
}
