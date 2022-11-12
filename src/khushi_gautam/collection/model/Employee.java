package khushi_gautam.collection.model;

import java.util.Objects;

public class Employee {
    String Name;
    String Company;
    int experience;
    String Post;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return experience == employee.experience && Name.equals(employee.Name)
                && Company.equals(employee.Company) && Post.equals(employee.Post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Company, experience, Post);
    }

    // todo parameterized constructor
    public Employee(String name, String company, int experience, String post) {
        this.Name = name;
        this.Company = company;
        this.experience = experience;
        this.Post = post;
    }
    // todo getter setter method


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }
}
