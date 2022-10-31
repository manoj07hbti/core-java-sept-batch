package class_and_object;

public class Doctor {

    String name;
    String dept;
    int age;

    //parameterized constructor
    public Doctor(String name, String dept, int age) {
        this.name = name;
        this.dept = dept;
        this.age = age;
    }

    public static void main(String[] args) {

        Doctor obj= new Doctor("Mukesh","Heart",54);

        System.out.println("Name: "+obj.name+" Dept: "+obj.dept+" Age: "+obj.age);

        Doctor obj2= new Doctor("Ramesh","Surgery",60);

        System.out.println("Name: "+obj2.name+" Dept: "+obj2.dept+" Age: "+obj2.age);
    }
}
