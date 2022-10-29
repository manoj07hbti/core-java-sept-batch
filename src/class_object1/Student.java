package class_object1;

public class Student {

    // Todo : Student properties
    String Name = "Ravi";
    int rollNumber  = 34;
    String section = "B";


    // Todo : Student capabilities
    // write
    // read
    // run

    public static void main(String[] args) {

        // Todo : Create a object by the constructor method

        //Todo Syntax : ClassName objectName = new ClassName();
                        Student student = new Student();
        System.out.println("My  name is : " + student.Name);
        System.out.println("My rollNumber is : " +  student.rollNumber);
        System.out.println("Printing the section : " + student.section);

 System.out.println("Printing the Student details : " + student.Name +":" +student.rollNumber +":"+ student.section );

    }
}
