package model;

import java.util.Objects;

public class Employee {

    String Name;
    int age;
    String place;
    String sector;

    public Employee(String name, int age, String place, String sector) {
        Name = name;
        this.age = age;
        this.place = place;
        this.sector = sector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Name.equals(employee.Name) && place.equals(employee.place) && sector.equals(employee.sector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, age, place, sector);
    }

    // getter and setter

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
