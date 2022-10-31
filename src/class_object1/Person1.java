package class_object1;

public class Person1 {
    //Todo : Person properties
    String name;
    int familyMembers;
    double height;
    int age;

    // Todo : Parameter Constructor

    public Person1(String name, int familyMembers, double height, int age) {
        this.name = name;
        this.familyMembers = familyMembers;
        this.height = height;
        this.age = age;
    }

    //main method
    public static void main(String[] args) {

        // Todo : crete object by the constructor

        // Todo : Syntax
        //  ClassName objectName = new ClassName(Parameter1,Parameter2,Parameter3,...);

        Person1 person = new Person1("Ram", 7, 5.2, 40);
        System.out.println("Person name is : " + person.name);
        System.out.println("Total FamilyMembers " + person.familyMembers);
        System.out.println("Person Height : " + person.height);
        System.out.println("Person age is : " + person.age);

 System.out.println("Name : " + person.name + "," + " FamilyMembers : " + person.familyMembers + "," + " Height " + person.height + "" + "Age : " + person.age);
    }
}