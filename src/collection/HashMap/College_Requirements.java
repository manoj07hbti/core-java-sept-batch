package collection.HashMap;

import model.Clg_Students;

import java.util.ArrayList;
import java.util.HashMap;

public class College_Requirements {

    public HashMap<String, ArrayList<Clg_Students>> studentsinfo() {

        HashMap<String, ArrayList<Clg_Students>> info = new HashMap<>();


        ArrayList<Clg_Students> GIC = new ArrayList<>();
        ArrayList<Clg_Students> AKTU = new ArrayList<>();
        ArrayList<Clg_Students> DBRAU = new ArrayList<>();

        Clg_Students Std1 = new Clg_Students(1, "Satyam", 77);
        Clg_Students Std2 = new Clg_Students(2, "Shivam", 88);
        Clg_Students Std3 = new Clg_Students(3, "Sundaram", 80);

        GIC.add(Std1);
        GIC.add(Std2);
        GIC.add(Std3);

        Std1 = new Clg_Students(1, "Akash", 90);
        Std2 = new Clg_Students(2, "Anil", 68);
        Std3 = new Clg_Students(3, "Ajay", 63);

        AKTU.add(Std1);
        AKTU.add(Std2);
        AKTU.add(Std3);

        Std1 = new Clg_Students(1, "Amar", 89);
        Std2 = new Clg_Students(2, "Pallavi", 69);
        Std3 = new Clg_Students(3, "Shiva", 79);

        DBRAU.add(Std1);
        DBRAU.add(Std2);
        DBRAU.add(Std3);

        info.put("GIC", GIC);
        info.put("AKTU", AKTU);
        info.put("DBRAU", DBRAU);

        return info;

    }

    public static void main(String[] args) {

        College_Requirements obj = new College_Requirements();
        HashMap<String, ArrayList<Clg_Students>> info = obj.studentsinfo();

        for (String var : info.keySet()) {

            if (var == "GIC") {

                ArrayList<Clg_Students> studentArrayList = info.get(var);
                for (Clg_Students std : studentArrayList) {

                    System.out.println("GIC Student: " + std.getName() + " Roll No: " + std.getRollno() + " Section: " + std.getPercentage());
                }
            }
        }
        for (String var : info.keySet()) {

            if (var == "AKTU") {

                ArrayList<Clg_Students> studentArrayList = info.get(var);
                for (Clg_Students std : studentArrayList) {

                    System.out.println("AKTU Student: " + std.getName() + " Roll No: " + std.getRollno() + " Section: " + std.getPercentage());
                }
            }
        }
        for (String var : info.keySet()) {

            if (var == "DBRAU") {

                ArrayList<Clg_Students> studentArrayList = info.get(var);
                for (Clg_Students std : studentArrayList) {

                    System.out.println("DBRAU Student: " + std.getName() + " Roll No: " + std.getRollno() + " Percentage: " + std.getPercentage());
                }
            }
        }

    }


}
