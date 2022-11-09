package model;

public class Engineer {
    String name;
    String branch;
    int batch;
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
