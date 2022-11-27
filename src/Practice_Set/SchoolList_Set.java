package Practice_Set;

import model.School;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolList_Set {
    public ArrayList<School> schools() {


        ArrayList<School> schools = new ArrayList<>();

        School school1 = new School("Raj", 29, "History", "45000");
        School school2 = new School("Shanu", 29, "Hindi", "45000");
        School school3 = new School("Deepak", 30, "English", "49000");
        School school4 = new School("Parteek", 26, "phy", "45000");
        School school5 = new School("Deepak", 27, "Math", "49000");

        schools.add(school1);
        schools.add(school2);
        schools.add(school3);
        schools.add(school4);
        schools.add(school5);

        return schools;



    }




    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.nextInt();
        SchoolList_Set schoolList_set = new SchoolList_Set();
        ArrayList<School> schools = schoolList_set.schools();
        for (int i = 0; i < schoolList_set.schools().size(); i++) {
            System.out.println("teacher:" + (i + 1) + ":");
            System.out.println("School Teacher Name: :" + schools.get(i).getName() + ":" + "age" + schools.get(i).getAge() + ":" + "sub:" + schools.get(i).getSub() + ":" + "Salary:" + schools.get(i).getSalary());


        }
    }
}