package class_and_obj;

public class Demo_Engineer {
    String name;
    int DOB;
    String department;

    // parameterized constructor

    public Demo_Engineer(String name, int DOB, String department) {
        this.name = name;
        this.DOB = DOB;
        this.department = department;
    }

    public static void main(String[] args) {

        Demo_Engineer Eng = new Demo_Engineer("shivani ", 21121993, "CS"); // Default constructor

        System.out.println("Name: " + Eng.name + " DOB: " + Eng.DOB + " department: " + Eng.department);

        Demo_Engineer Eng2 = new Demo_Engineer("jyoti ", 20021995, "EE");

        System.out.println("Name: " + Eng2.name + " DOB: " + Eng.DOB + " department: " + Eng.department);

    }
}
