package model;

public class Clg_Students {

    int Rollno;
    String Name;
    int percentage;

    public Clg_Students(int rollno, String name, int percentage) {
        Rollno = rollno;
        Name = name;
        this.percentage = percentage;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }


}
