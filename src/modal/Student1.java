package modal;

public class Student1 {

    int RollNo;
    String name;
    String course;
    double percentage;

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Student1(int rollNo, String name, String course, double percentage) {

        RollNo = rollNo;
        this.name = name;
        this.course = course;
        this.percentage = percentage;


    }
}
