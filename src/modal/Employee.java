package modal;

import java.util.Objects;

public class Employee {

    String name;
    int salary;
    String company;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && name.equals(employee.name) && company.equals(employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, company);
    }

    public Employee(String name, int salary, String company) {
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
