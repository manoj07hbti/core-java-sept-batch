package collection_demo.hash_map_demo;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoHashMapAdvance {


    public  HashMap <String, ArrayList<Student>> createStudentInfo(){

     //HashMap<Datatype_key, DataType_Value> objName= new HashMap<>();

        HashMap <String, ArrayList<Student>> studentInfo = new HashMap<>();

        ArrayList<Student> glaList= new ArrayList<>();
        ArrayList<Student> agcList= new ArrayList<>();
        ArrayList<Student> rbsList= new ArrayList<>();
        ArrayList<Student> hdtList= new ArrayList<>();

        Student student1= new Student(1,"Mohit", "CIVIL");

        Student student2= new Student(2,"rakesh","IT");

        Student student3= new Student(3,"Jatin","CS");

        glaList.add(student1);
        glaList.add(student2);
        glaList.add(student3);


         student1= new Student(1,"Rajesh", "CIVIL");

         student2= new Student(2,"Rahul","IT");

         student3= new Student(3,"Kumar","CS");
        agcList.add(student1);
        agcList.add(student2);
        agcList.add(student3);


        studentInfo.put("GLA",glaList);
        studentInfo.put("AGC",agcList);

        return studentInfo;
    }



    public static void main(String[] args) {


     DemoHashMapAdvance obj= new DemoHashMapAdvance();
     HashMap <String, ArrayList<Student>> studentInfo= obj.createStudentInfo();

     for (String var: studentInfo.keySet()) {

        // System.out.println("Printing student info " +"College Name : "+var +" Student info "+studentInfo.get(var));
         if(var=="GLA"){

             ArrayList<Student> studentArrayList = studentInfo.get(var);
             for (Student std: studentArrayList){

                 System.out.println("GLA Student: "+std.getName() +" Roll No: "+std.getRollNo() +" Section: "+std.getSection());
             }

         }


     }


    }
}
