package StudentData;

public class Demo_Data {

    int number;
    String names;
    int rollNumber;
    String branch;
    String section;

    public Demo_Data(String s, String akash, String s1, String mechanical, String a) {
    }

    public Demo_Data(String s) {
    }

    public Demo_Data() {

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Demo_Data(int number, String names, int rollNumber, String branch, String section) {
        this.number = number;
        this.names = names;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.section = section;

    }
}
