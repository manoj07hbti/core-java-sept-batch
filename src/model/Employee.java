package model;

public class Employee {

    String name;
    int age;
    String Branch;

    public Employee(String name, int age, String branch) {

        this.name = name;
        this.age = age;
        Branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }
}




