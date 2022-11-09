package model;

public class Student {

    //data member
    int rollNo;
    String name;
    String section;

    //parameterized constructor
    public Student(int rollNo, String name, String section) {
        this.rollNo = rollNo;
        this.name = name;
        this.section = section;
    }

    // getter and setter method


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
