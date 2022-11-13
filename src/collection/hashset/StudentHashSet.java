package collection.hashset;

import modal.Student;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student>  studentHashSet (){

        HashSet<Student> studentHashSet = new HashSet<>();

        // data of student

        Student no1 = new Student(1,"Abhinav","CS");
        System.out.println("hashcode of student no1 :  "+no1.hashCode());
        Student no2 = new Student(2, "Ketan", "IT");
        System.out.println("hashcode of student no2 :  "+no2.hashCode());
        Student no3 = new Student(3, "surendra", "EE");
        System.out.println("hashcode of student no3 :  "+no3.hashCode());
        Student no4 = new Student(1,"Abhinav","CS");
        System.out.println("hashcode of student no4 :  "+no4.hashCode());


        studentHashSet.add(no1);
        studentHashSet.add(no2);
        studentHashSet.add(no3);
        studentHashSet.add(no4);

        return studentHashSet;

    }


    public static void main(String[] args) {

        StudentHashSet obj = new StudentHashSet();
        HashSet<Student> studentHashSet = obj.studentHashSet();


        for(Student var : studentHashSet){
            System.out.println("printing data :====  name: "  +var.getName()+ "  rollNo  :  "+var.getRollNo()+
                    "   section  : " +var.getSection());
        }
    }
}
