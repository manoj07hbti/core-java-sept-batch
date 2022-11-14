package model;

public class Student {

    int SNumber ;
    String SName ;
    String Branch ;

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
