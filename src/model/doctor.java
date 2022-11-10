package model;

public class doctor {

    int id;
    String name;
    String hospName;

    public doctor(int id, String name, String hospName) {
        this.id = id;
        this.name = name;
        this.hospName = hospName;
    }
        // getter and setter method


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public static void main(String[] args) {

    }
}
