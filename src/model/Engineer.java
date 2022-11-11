package model;

import java.util.Objects;

public class Engineer {
    String name;
    String branch;
    int batch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return batch == engineer.batch && name.equals(engineer.name) && branch.equals(engineer.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, branch, batch);
    }

    //parameterized constructor
    public Engineer(String name, String branch, int batch) {
        this.name = name;
        this.branch = branch;
        this.batch = batch;
    }
    // getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }
}
