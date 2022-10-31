package class_and_object;


public class DemoStudent {

    String name;
    int rollNo;
    String section;

    // default constructor
    public DemoStudent() {
    }

    // parameterized constructor

    public DemoStudent(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public static void main(String[] args) {

        DemoStudent student= new DemoStudent("Rahul",1,"CS"); // Default constructor

        System.out.println("Name :" +student.name + " Roll No: "+student.rollNo +" Section: "+student.section);

        DemoStudent student2 = new DemoStudent("Mukesh",2,"IT");
        System.out.println("Name :" +student2.name + " Roll No: "+student2.rollNo +" Section: "+student2.section);

        DemoStudent student3= new DemoStudent("Jatin",3,"CS");

        System.out.println("Name :" +student3.name + " Roll No: "+student3.rollNo +" Section: "+student3.section);
    }

}
