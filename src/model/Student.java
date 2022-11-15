package model;

public class Student {
    int rollNum;
    String Name;
    int percent;

    public Student(int rollNum, String name, int percent) {
        this.rollNum = rollNum;
        Name = name;
        this.percent = percent;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
