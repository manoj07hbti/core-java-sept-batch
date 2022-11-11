
package hashset;

import com.sun.deploy.util.JVMParameters;
import model.Student;

import java.util.HashSet;

public class Student_hashset {
    public HashSet<Student> student() {
        HashSet<Student> Student_hashset = new HashSet<>();

        Student student1 = new Student(1, "Ravi;", "It");
        Student student2 = new Student(6, "raj", "It");
        Student student3 = new Student(5, "deepak;", "It");
        Student student4 = new Student(2, "Raj", "It");
        Student student5 = new Student(3, "Shanu;", "It");
        Student student6 = new Student(3, "Shanu;", "It");

        Student_hashset.add(student1);
        Student_hashset.add(student2);
        Student_hashset.add(student3);
        Student_hashset.add(student4);
        Student_hashset.add(student5);
        Student_hashset.add(student6);

        return Student_hashset;


    }


    public static void main(String[] args) {
        Student_hashset obj = new Student_hashset();
        HashSet<Student> Student_hashset = obj.student();
        for (Student var : Student_hashset) {
            System.out.println("printing the :" + var.getName() + "Roll no" + var.getRollNo() + "section:" + var.getSection());

        }



        }


    }



