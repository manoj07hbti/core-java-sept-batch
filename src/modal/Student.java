package modal;

import java.util.Objects;

public class Student {

    int rollNo;
    String name;
    String section;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && name.equals(student.name) && section.equals(student.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, section);
    }

    public Student(int rollNo, String name, String section) {
        this.rollNo = rollNo;
        this.name = name;
        this.section = section;
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
}
