package collection_demo.list_demo;


import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    // create a method which will create StudentArrayList

    public   ArrayList<Student> createStudentList(){
        //TODO SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();

        ArrayList <Student> studentArrayList= new ArrayList<>();

        // now we need to add information about students

        Student student1= new Student(1,"Raj","IT");
        Student student2= new Student(2,"Mukesh","CS");
        Student student3= new Student(3,"Rahul","CIVIL");

        // adding data to the list

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        return studentArrayList;

    }




    public static void main(String[] args) {

        StudentArrayList obj= new StudentArrayList();

        ArrayList <Student> studentArrayList=  obj.createStudentList();

        studentArrayList.get(0).setSection("Information Technology");
        studentArrayList.get(1).setSection("Computer Science");

        for(int i=0; i<studentArrayList.size(); i++){

            System.out.println("Printing "+studentArrayList.get(i).getName() +" RollNo: "+studentArrayList.get(i).getRollNo()+ " Section: "+ studentArrayList.get(i).getSection());
        }

    }
}
