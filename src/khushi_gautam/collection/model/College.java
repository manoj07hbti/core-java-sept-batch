package khushi_gautam.collection.model;

public class College {
    String collegeName;
    int totalStudents;
    int passStudents;
    Double ratio;

    public College(String collegeName, int totalStudents, int passStudents, Double ratio) {
        this.collegeName = collegeName;
        this.totalStudents = totalStudents;
        this.passStudents = passStudents;
        this.ratio = ratio;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public int getPassStudents() {
        return passStudents;
    }

    public void setPassStudents(int passStudents) {
        this.passStudents = passStudents;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}
