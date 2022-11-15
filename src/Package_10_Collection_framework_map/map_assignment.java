package Package_10_Collection_framework_map;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class map_assignment {
    /* Requirement :
 1- I want to display result of all College in UP

    roll no   name   division

2- I want to display result of college who is having 80% passing ratio

3- Display college data which is part of UP state (we have data of all colleges)*/

public LinkedHashMap<String, ArrayList<Student>> studentList(){
    LinkedHashMap<String, ArrayList<Student> > students = new  LinkedHashMap<>();
    Student Student1 = new Student(156,"Rahul",85);
    Student Student2 = new Student(124,"Manish",70);
    Student Student3  = new Student(126,"Deepak",60);
    ArrayList<Student> IIT_KANPUR = new ArrayList<>();
    IIT_KANPUR.add(Student1);
    IIT_KANPUR.add(Student2);
    IIT_KANPUR.add(Student3);
    students.put("IIT_KANPUR",IIT_KANPUR);
     Student1 = new Student(784,"Dinesh",88);
     Student2 = new Student(456,"Mohit",73);
     Student3  = new Student(234,"Ramesh",80);
    ArrayList<Student> IIT_BANARAS = new ArrayList<>();
    IIT_BANARAS.add(Student1);
    IIT_BANARAS.add(Student2);
    IIT_BANARAS.add(Student3);
    students.put("IIT_BANARAS",IIT_BANARAS);
    Student1 = new Student(458,"Kartik",68);
    Student2 = new Student(963,"Akshay",73);
    Student3  = new Student(478,"Himanshu",83);
    ArrayList<Student> IIT_BOMBAY = new ArrayList<>();
    IIT_BOMBAY.add(Student1);
    IIT_BOMBAY.add(Student2);
    IIT_BOMBAY.add(Student3);
    students.put("IIT_BOMBAY", IIT_BOMBAY);
    Student1 = new Student(521,"siddarth",98);
    Student2 = new Student(364,"varun",86);
    Student3  = new Student(145,"amit",73);
    ArrayList<Student> IIT_MADRAS = new ArrayList<>();
    IIT_MADRAS.add(Student1);
    IIT_MADRAS.add(Student2);
    IIT_MADRAS.add(Student3);
    students.put("IIT_MADRAS", IIT_MADRAS);
    return students;

}

    public static void main(String[] args) {
        map_assignment obj = new map_assignment();
        LinkedHashMap<String, ArrayList<Student> > students = obj.studentList();
        Set<String> keys = students.keySet();
        for (String elements : keys ) {
          /*  if (elements == "IIT_KANPUR") {
                System.out.println("students of first college of Uttar pradesh");
            } else if (elements == "IIT_BANARAS") {
                System.out.println("students of second college of Uttar pradesh");
            } else if (elements == "IIT_BOMBAY") {
                System.out.println("students of first college of Madhya pradesh");
            } else if (elements == "IIT_MADRAS") {
                System.out.println("students of first college of Rajasthan");
            }*/
            ArrayList<Student> demo = students.get(elements);
            for (int i = 0; i < demo.size(); i++) {
                System.out.println("College: "+elements+ ", Roll no.: " + demo.get(i).getRollNum() + ", name: " + demo.get(i).getName() + ", percent: " + demo.get(i).getPercent());
            }
        }
            System.out.println("=========================================================================");
            System.out.println("All students of Uttar pradesh are following");
            for (String element : keys ) {
                if (element.contains("BANARAS")|| element.contains("KANPUR")) {
                    ArrayList<Student> demo1 = students.get(element);
                    for (int i = 0; i < demo1.size(); i++) {
                        System.out.println("College: "+element+ ", Roll no.: " + demo1.get(i).getRollNum() + ", name: " + demo1.get(i).getName() + ", percent: " + demo1.get(i).getPercent());
                    }
                }
            }
        System.out.println("=========================================================================");
        System.out.println("All students having percentage above 80 are following");
        for (String element : keys ) {
                ArrayList<Student> demo1 = students.get(element);
                for (int i = 0; i < demo1.size(); i++) {
                    if (demo1.get(i).getPercent() >= 80) {
                        System.out.println("College: "+element+ ", Roll no.: " + demo1.get(i).getRollNum() + ", name: " + demo1.get(i).getName() + ", percent: " + demo1.get(i).getPercent());
                    }
                }

        }

    }

}
