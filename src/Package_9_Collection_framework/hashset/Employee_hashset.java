package Package_9_Collection_framework.hashset;

import model.Employee;

import java.util.HashSet;

public class Employee_hashset {
    public HashSet<Employee> empDetails(){
        HashSet<Employee> EmpDetails = new HashSet<>();
        Employee emp1 = new Employee("Sachin", 23,25000.25);
        Employee emp2=new Employee("rahul",24,20000.48);
        Employee emp3 = new Employee("saurabh",25,18000.60);
        EmpDetails.add(emp1);
        EmpDetails.add(emp2);
        EmpDetails.add(emp3);
        return EmpDetails;
    }

    public static void main(String[] args) {
        Employee_hashset obj = new Employee_hashset();
        HashSet<Employee> EmpDetails = obj.empDetails();
        for (Employee element:EmpDetails) {
            System.out.println(element.getName()+" "+element.getSalary()+" "+element.getId());
        }
        System.out.println(EmpDetails);
    }
}
