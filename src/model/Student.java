package model;

import java.util.Objects;

public class Student {
    //DATA MEMBER
    int rollNo;
    String name;
    String section;
    int rank;
    long phnNo;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && rank == student.rank && phnNo == student.phnNo && name.equals(student.name) && section.equals(student.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, section, rank, phnNo);
    }

    public Student(int rollNo, String name, String section, int rank, long phnNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.section = section;
        this.rank = rank;
        this.phnNo = phnNo;

    }

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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public long getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(long phnNo) {
        this.phnNo = phnNo;
    }
}