package model;

import java.util.Objects;

public class Student {

    int SNumber ;
    String SName ;
    String Branch ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return SNumber == student.SNumber && Objects.equals(SName, student.SName) && Objects.equals(Branch, student.Branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SNumber, SName, Branch);
    }

    public Student(int SNumber, String SName, String branch) {
        this.SNumber = SNumber;
        this.SName = SName;
        Branch = branch;
    }

    public int getSNumber() {
        return SNumber;
    }

    public void setSNumber(int SNumber) {
        this.SNumber = SNumber;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public static void main(String[] args) {

    }
}
