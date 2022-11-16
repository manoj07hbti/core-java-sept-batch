package collection.hashMap;

import model.Student;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Set;

public class Assignment {

      /* Todo :  Requirement :
          // (1)- I want to display result of all College in UProll no   name   division
          // (2)- I want to display result of college who is having 80% passing ratio
          // (3)- Display college data which is part of UP state (we have data of all colleges)
                                                                                  */

    public LinkedHashMap<String, ArrayList<Student>> studentList() {
        LinkedHashMap<String, ArrayList<Student>> students = new LinkedHashMap<>();
        Student Student1 = new Student("Raj", 21, 80);
        Student Student2 = new Student("Ram", 123, 70);
        Student Student3 = new Student("Deepak", 125, 60);
        ArrayList<Student> IIT_KANPUR = new ArrayList<>();
        IIT_KANPUR.add(Student1);
        IIT_KANPUR.add(Student2);
        IIT_KANPUR.add(Student3);
        students.put("IIT_KANPUR", IIT_KANPUR);
        Student1 = new Student("Sunil", 784, 88);
        Student2 = new Student("Rajiv", 456, 73);
        Student3 = new Student("Sushil", 234, 80);
        ArrayList<Student> IIT_BANARAS = new ArrayList<>();
        IIT_BANARAS.add(Student1);
        IIT_BANARAS.add(Student2);
        IIT_BANARAS.add(Student3);
        students.put("IIT_BANARAS", IIT_BANARAS);
        Student1 = new Student("Vinay", 458, 68);
        Student2 = new Student("Akshay", 963, 73);
        Student3 = new Student("Suraj", 478, 83);
        ArrayList<Student> IIT_BOMBAY = new ArrayList<>();
        IIT_BOMBAY.add(Student1);
        IIT_BOMBAY.add(Student2);
        IIT_BOMBAY.add(Student3);
        students.put("IIT_BOMBAY", IIT_BOMBAY);
        Student1 = new Student("Shyam", 521, 98);
        Student2 = new Student("Vishal", 364, 86);
        Student3 = new Student("Amit", 145, 73);
        ArrayList<Student> IIT_MADRAS = new ArrayList<>();
        IIT_MADRAS.add(Student1);
        IIT_MADRAS.add(Student2);
        IIT_MADRAS.add(Student3);
        students.put("IIT_MADRAS", IIT_MADRAS);
        return students;

    }

    public static void main(String[] args) {
        Assignment obj = new Assignment();
        LinkedHashMap<String, ArrayList<Student>> students = obj.studentList();
        Set<String> keys = students.keySet();
        for (String elements : keys) {
          /*  if (elements == "IIT_KANPUR") {
                System.out.println("students of first college of Uttar pradesh");
            } else if (elements == "IIT_BANANAS") {
                System.out.println("students of second college of Uttar pradesh");
            } else if (elements == "IIT_BOMBAY") {
                System.out.println("students of first college of Madhya pradesh");
            } else if (elements == "IIT_MADRAS") {
                System.out.println("students of first college of Rajasthan");
            }*/
            ArrayList<Student> demo = students.get(elements);
            for (int i = 0; i < demo.size(); i++) {
                System.out.println("College: " + elements + ", Roll no.: " + demo.get(i).getRollNumber() + ", name: " + demo.get(i).getName() + ", percent: " + demo.get(i).getPercent());
            }
        }
        System.out.println("==================================");
        System.out.println("All students of Uttar pradesh are following");
        for (String element : keys) {
            if (element.contains("BANARAS") || element.contains("KANPUR")) {
                ArrayList<Student> demo1 = students.get(element);
                for (int i = 0; i < demo1.size(); i++) {
                    System.out.println("College: " + element + ", Roll no.: " + demo1.get(i).getRollNumber() + ", name: " + demo1.get(i).getName() + ", percent: " + demo1.get(i).getPercent());
                }
            }
        }
        System.out.println("===================================");
        System.out.println("All students having percentage above 80 are following");
        for (String element : keys) {
            ArrayList<Student> demo1 = students.get(element);
            for (int i = 0; i < demo1.size(); i++) {
                if (demo1.get(i).getPercent() >= 80) {
                    System.out.println("College: " + element + ", Roll no.: " + demo1.get(i).getRollNumber() + ", name: " + demo1.get(i).getName() + ", percent: " + demo1.get(i).getPercent());
                }
            }

        }

    }

}

