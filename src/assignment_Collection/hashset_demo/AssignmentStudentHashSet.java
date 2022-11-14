package assignment_Collection.hashset_demo;

import model.Student;

import java.util.HashSet;

public class AssignmentStudentHashSet {

    public HashSet<Student> createStudentSet(){

        HashSet<Student> studentHashset = new HashSet<>();

        ///create some data of student

        Student student1 = new Student(1,"Rahul","CS");
        Student student2 = new Student(2,"Sanju","IT");
        Student student3 = new Student(3,"Gagan","Civil");
        Student student4 = new Student(2,"Sanju","IT");
        Student student5 = new Student(3,"Gagan","Civil");

        studentHashset.add(student1);
        studentHashset.add(student2);
        studentHashset.add(student3);
        studentHashset.add(student4);
        studentHashset.add(student5);


        return  studentHashset;
     }


    public static void main(String[] args) {

        AssignmentStudentHashSet obj = new AssignmentStudentHashSet();
        HashSet<Student> studentHashSet =obj.createStudentSet();
        for (Student var : studentHashSet){
            System.out.println("Printing Roll Number : " + var.getSNumber() +" Name : " +var.getSName()+ " Branch : " +var.getBranch() );
        }

    }
}
