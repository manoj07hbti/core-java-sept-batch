package collection.hashset;

import modal.Student;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Student> students = new LinkedHashSet<>();

        Student no1 = new Student(1, "Abhinav", "CS");

        Student no2 = new Student(2, "Ketan", "IT");

        Student no3 = new Student(3, "surendra", "EE");

        Student no4 = new Student(1, "Abhinav", "CS");


        students.add(no1);
        students.add(no2);
        students.add(no3);
        students.add(no4);


        for (Student var : students) {

            System.out.println("Printing students : " + var.getName() + "  rollNo  :" + var.getRollNo() + "  section : " +
                    "" + var.getSection());
        }
    }

}



