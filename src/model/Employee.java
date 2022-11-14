package model;

import java.util.Objects;

public class Employee {

    String name;
    int age;
    String Branch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(Branch, employee.Branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Branch);
    }

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




