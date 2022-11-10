package collection_demo.hashset_demo;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student> createStudenSet(){

        HashSet <Student> studentHashSet = new HashSet<>();

        // create some data of Student

        Student student1= new Student(1,"Mohit", "CIVIL");
        Student student2= new Student(2,"rakesh","IT");
        Student student3= new Student(3,"Jatin","CS");
        Student student4= new Student(1,"Mohit", "CIVIL");
        Student student5= new Student(2,"rakesh","IT");

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);


        return  studentHashSet;

    }


    public static void main(String[] args) {

        StudentHashSet obj= new StudentHashSet();
        HashSet <Student> studentHashSet=  obj.createStudenSet();

        for(Student var: studentHashSet){

            System.out.println("Printing "+var.getName() +" RollNo: "+var.getRollNo() +" Section: "+var.getSection());
        }

    }
}
