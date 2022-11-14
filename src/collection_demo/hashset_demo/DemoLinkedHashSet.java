package collection_demo.hashset_demo;

import model.Student;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {


    public static void main(String[] args) {

        LinkedHashSet <Student> students= new LinkedHashSet<>();

        Student student1= new Student(1,"Mohit", "CIVIL");

        Student student2= new Student(2,"rakesh","IT");

        Student student3= new Student(3,"Jatin","CS");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(Student var : students){

            System.out.println("Printing Student info: "+var.getName() +" Rollno: "+var.getRollNo()+" Section: "+var.getSection());
        }


    }

}
