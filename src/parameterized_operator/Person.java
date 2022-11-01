package parameterized_operator;

public class Person {


    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args){

        Person vip = new Person("Ann",24,"female");
        System.out.println("Name: "+vip.name+ " Age: "+vip.age+ " Gender: "+vip.gender);
        Person obj = new Person("Aman", 24, "male");
        System.out.println("Name: "+obj.name+ " Age: "+obj.age+ " Gender: "+obj.gender);
        Person imp = new Person("Mohit", 24, "unknown");
        System.out.println("Name: "+imp.name+ " Age: "+imp.age+ " Gender: "+imp.gender );
    }
}


