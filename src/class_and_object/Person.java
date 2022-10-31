package class_and_object;

public class Person {
String name;
String education;
String city;

    public Person(String name, String education, String city) {
        this.name = name;
        this.education = education;
        this.city = city;
    }
    public static void main(String[] args) {
        Person person1 = new Person("Ramesh","BA","Mathura");
        Person person2 = new Person("Suresh","BSc","Kanpur");
        Person person3 = new Person("Kamlesh","BCom","Lucknow");
        System.out.println("---Person 1 details---");
        System.out.println("name: "+person1.name+"\n"+"Qualification: "+person1.education+"\n"+"City: "+person1.city);
        System.out.println("---Person 2 details---");
        System.out.println("name: "+person2.name+"\n"+"Qualification: "+person2.education+"\n"+"City: "+person2.city);
        System.out.println("---Person 3 details---");
        System.out.println("name: "+person3.name+"\n"+"Qualification: "+person3.education+"\n"+"City: "+person3.city);

    }
}
