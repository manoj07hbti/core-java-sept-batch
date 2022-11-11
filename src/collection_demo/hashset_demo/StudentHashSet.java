package collection_demo.hashset_demo;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student> createStudenSet(){

        HashSet <Student> studentHashSet = new HashSet<>();

        // create some data of Student

        Student student1= new Student(1,"Mohit", "CIVIL");
        System.out.println("Printing hashcode of Student 1: "+student1.hashCode());

        Student student2= new Student(2,"rakesh","IT");
        System.out.println("Printing hashcode of Student 2: "+student2.hashCode());

        Student student3= new Student(3,"Jatin","CS");
        System.out.println("Printing hashcode of Student 3: "+student3.hashCode());

        Student student4= new Student(1,"Mohit", "CIVIL");
        System.out.println("Printing hashcode of Student 4: "+student4.hashCode());

        Student student5= new Student(2,"rakesh","IT");
        System.out.println("Printing hashcode of Student 5: "+student5.hashCode());

        Student student6= new Student(6,"rakesh","IT");
        System.out.println("Printing hashcode of Student 5: "+student6.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
        studentHashSet.add(student6);

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
