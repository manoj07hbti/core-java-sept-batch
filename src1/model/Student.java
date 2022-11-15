package model;

import java.util.Objects;

public class Student {

    String name;
    String departmen;
    int rollno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno && name.equals(student.name) && departmen.equals(student.departmen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departmen, rollno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmen() {
        return departmen;
    }

    public void setDepartmen(String departmen) {
        this.departmen = departmen;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Student(String name, String departmen, int rollno) {
        this.name = name;
        this.departmen = departmen;
        this.rollno = rollno;


    }
}
