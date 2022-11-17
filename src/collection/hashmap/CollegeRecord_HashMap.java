package collection.hashmap;

import modal.Student;
import modal.Student1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CollegeRecord_HashMap {


    public HashMap<String, ArrayList<Student1>> record() {

        HashMap<String, ArrayList<Student1>> students = new HashMap<>();

        ArrayList<Student1> IPEC = new ArrayList<>();

        ArrayList<Student1> IDEAL = new ArrayList<>();

        ArrayList<Student1> AKG = new ArrayList<>();

        ArrayList<Student1> IMS = new ArrayList<>();

        Student1 no1 = new Student1(1, "shivani", "B.Tech", 77.7);

        Student1 no2 = new Student1(2, "priya", "B.Tech", 89.3);

        Student1 no3 = new Student1(3, "pragati", "B.Tech", 69);

        Student1 no4 = new Student1(4, " jyoti", "B.Tech", 63.5);

        Student1 no5 = new Student1(5, "nayan", "B.tech", 85);

        IPEC.add(no1);
        IPEC.add(no2);
        IPEC.add(no3);
        IPEC.add(no4);
        IPEC.add(no5);


        no1 = new Student1(1, "Anu", "B.Tech", 50);

        no2 = new Student1(2, "radha", "B.Tech", 46.5);

        no3 = new Student1(3, "kamal", "B.Tech", 69);

        no4 = new Student1(4, " subhi", "B.Tech", 93.5);

        no5 = new Student1(5, "aayush", "B.tech", 85.69);

        IDEAL.add(no1);
        IDEAL.add(no2);
        IDEAL.add(no3);
        IDEAL.add(no4);
        IDEAL.add(no5);

        no1 = new Student1(1, "rinku", "B.Tech", 50);

        no2 = new Student1(2, "paavi", "B.Tech", 46.5);

        no3 = new Student1(3, "pari", "B.Tech", 69);

        no4 = new Student1(4, " aadhya", "B.Tech", 93.5);

        no5 = new Student1(5, "gudiya", "B.tech", 85.69);

        AKG.add(no1);
        AKG.add(no2);
        AKG.add(no3);
        AKG.add(no4);
        AKG.add(no5);

        no1 = new Student1(1, "Sonu", "B.Tech", 50);

        no2 = new Student1(2, "puneet", "B.Tech", 46.5);

        no3 = new Student1(3, "vikram", "B.Tech", 69);

        no4 = new Student1(4, " piyush", "B.Tech", 93.5);

        no5 = new Student1(5, "krishna", "B.tech", 85.69);

        IMS.add(no1);
        IMS.add(no2);
        IMS.add(no3);
        IMS.add(no4);
        IMS.add(no5);

        students.put("IPEC", IPEC);
        students.put("IDEAL", IDEAL);
        students.put("AKG", AKG);
        students.put("IMS", IMS);

        return students;

    }

    public static void main(String[] args) {

        CollegeRecord_HashMap obj = new CollegeRecord_HashMap();
        HashMap<String, ArrayList<Student1>> students = obj.record();


        for (String var : students.keySet()) {
            if (var == "IPEC") {

                ArrayList<Student1> studentArrayList = students.get(var);
                for (Student1 std : studentArrayList) {

                    System.out.println("IPEC STUDENTS====================>>");
                    System.out.println("IPEC data:  Name " + std.getName() + " Roll No: " + std.getRollNo() + " course : " + std.getCourse() +

                            " percentage : " + std.getPercentage());
                }

            }
        }
        for (String var : students.keySet()) {
            if (var == "IDEAL") {

                ArrayList<Student1> studentArrayList = students.get(var);
                for (Student1 std : studentArrayList) {

                    System.out.println("IDEAL STUDENTS====================>>");
                    System.out.println("IDEAL data:  Name " + std.getName() + " Roll No: " + std.getRollNo() + " course : " + std.getCourse() +

                            " percentage : " + std.getPercentage());
                }
            }
        }

        for (String var : students.keySet()) {
            if (var == "AKG") {

                ArrayList<Student1> studentArrayList = students.get(var);
                for (Student1 std : studentArrayList) {

                    System.out.println("AKG STUDENTS====================>>");
                    System.out.println("AKG data:  Name " + std.getName() + " Roll No: " + std.getRollNo() + " course : " + std.getCourse() +

                            " percentage : " + std.getPercentage());
                }
            }
        }


        for (String var : students.keySet()) {
            if (var == "IMS") {

                ArrayList<Student1> studentArrayList = students.get(var);
                for (Student1 std : studentArrayList) {

                    System.out.println("IMS STUDENTS====================>>");
                    System.out.println("IMS data:  Name " + std.getName() + " Roll No: " + std.getRollNo() + " course : " + std.getCourse() +

                            " percentage : " + std.getPercentage());
                }
            }
        }
    }
}


