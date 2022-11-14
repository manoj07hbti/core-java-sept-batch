package hashset;

import Collection.EmployeeList;
import model.Employee;

import java.util.HashSet;

public class Employee_Hashcode {

    public HashSet<Employee> EmployeeHashcode() {


        HashSet<Employee> Employee_Hashcode = new HashSet<>();

        Employee Employee1 = new Employee("Ravi:", 29, "Kanpur:", "It");
        System.out.println("printing Employee1:" + Employee1.hashCode());


        Employee Employee2 = new Employee("Raj:", 30, "Unnao:", "cs");
        System.out.println("printing Employee2:" + Employee2.hashCode());


        Employee Employee3 = new Employee("Deepak:", 45, "Goa", "It");
        System.out.println("printing Employee3:" + Employee3.hashCode());


        Employee Employee4 = new Employee("Rahul:", 35, "Gwalior:", "cs");
        System.out.println("printing Employee4:" + Employee4.hashCode());


        Employee Employee5 = new Employee("Rahul:", 35, "Gwalior:", "cs");
        System.out.println("printing Employee5:" + Employee5.hashCode());


        Employee Employee6 = new Employee("Raj:", 30, "Unnao:", "cs");
        System.out.println("printing Employee1:" + Employee1.hashCode());


        Employee_Hashcode.add(Employee1);
        Employee_Hashcode.add(Employee2);
        Employee_Hashcode.add(Employee3);
        Employee_Hashcode.add(Employee4);
        Employee_Hashcode.add(Employee5);
        Employee_Hashcode.add(Employee6);





        return Employee_Hashcode;

    }

    public static void main(String[] args) {

        Employee_Hashcode obj = new Employee_Hashcode();

HashSet<Employee>Employee=obj.EmployeeHashcode();
        for (Employee var : obj.EmployeeHashcode()) {

            System.out.println("printing name:" + var.getName() + "age" + var.getAge() + "place" + var.getPlace() + "sector:" + var.getSector());

        }

    }
}