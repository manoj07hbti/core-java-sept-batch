package aj_constructor;

public class Student {
    String name;
    String course;
    String college="Galgotias University";

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public static void main(String[] args) {
        Student s1= new Student("Ajeet","MCA");
        System.out.println("Name: "+s1.name+" Course: "+ s1.course+" College: "+ s1.college);
        Student s2= new Student("Saurabh","B Tech");
        System.out.println("Name: "+s2.name+" Course: "+ s2.course+" College: "+ s2.college);
    }
}
