package class_object;

public class Person {

    String name;
    String address;
    int age;
    int height;

    public Person(String name, String address, int age, int height) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Person person = new Person("Raghav","Mathura",24,5);
        System.out.println(" Name : " +person.name+ " Address : " +person.address+ " Age : " +person.age+ " Height : " +person.height);


    }
}
