package collection.list;

import modal.Student;

import java.util.ArrayList;
public class StudentArrayList {


    public ArrayList<Student> StudentList() {

        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        Student no1 = new Student(1, "shivani", "CS");
        Student no2 = new Student(2, "parth", "IT");
        Student no3 = new Student(3, "Shiva", "EE");
        Student no4 = new Student(4, "Ketan", "ME");

        studentArrayList.add(no1);
        studentArrayList.add(no2);
        studentArrayList.add(no3);
        studentArrayList.add(no4);

        return studentArrayList;
    }

    public static void main(String[] args) {
        StudentArrayList obj = new StudentArrayList();

        ArrayList<Student> studentArrayList = obj.StudentList();

        for(int i=0; i<studentArrayList.size(); i++){

            System.out.println("printing data  :" +studentArrayList.get(i).getName() +" rollNo  :  " +studentArrayList.get(i).getRollNo()+ " section :  "+studentArrayList.get(i).getSection());
        }
    }
}

