package hashset;

import model.Employee;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class DemoLinkedSet {

    public static void main(String[] args) {
        LinkedHashSet<Employee> Employee= new LinkedHashSet<>();
        Employee Student1 = new Employee(22,"Neeraj","IT");
        Employee Student2 = new Employee(27,"Jaydeep","CS");
        Employee Student3 = new Employee(21,"Kamal","HR");
        Employee Student4 = new Employee(26,"Raj","M");

        Employee.add(Student1);
        Employee.add(Student2);
        Employee.add(Student3);
        Employee.add(Student4);

        for (Employee var: Employee){

            System.out.println("Printing LinkedashSet for loop-- "+var.getName()+"department  "+var.getDepartment()+"age "+var.getAge());
        }



    }
}
