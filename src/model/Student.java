package model;

public class Student {

    // properties

    String name;
    int rollNumber;
    int percent;

    // parameter constructor


    public Student(String name, int rollNumber, int percent) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.percent = percent;
    }

    // getter and setter method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
