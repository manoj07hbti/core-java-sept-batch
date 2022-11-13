package collection.hashset;

import modal.Employee;

import java.util.HashSet;

public class EmployeeHashSet {


    public HashSet<Employee> employeeHashSet() {

        HashSet<Employee> employeeHashSet = new HashSet<>();

        Employee emp1 = new Employee("pavvi", 12000, "TCS");
        System.out.println("hash code of emp1  :" + emp1.hashCode());

        Employee emp2 = new Employee("Ahhya", 35000, "mahindra");
        System.out.println("hash code of emp2   :  " + emp2.hashCode());

        Employee emp3 = new Employee("pavvi", 12000, "TCS");
        System.out.println("hash code of emp3  :" + emp3.hashCode());

        employeeHashSet.add(emp1);
        employeeHashSet.add(emp2);
        employeeHashSet.add(emp3);

        return employeeHashSet;

    }

    public static void main(String[] args) {

        EmployeeHashSet obj = new EmployeeHashSet();
        HashSet<Employee> employeeHashSet = obj.employeeHashSet();


        for (Employee var : employeeHashSet) {

            System.out.println("Printing Employee data :==== :" + var.getName() + "  salary  : " + var.getSalary() +
                    "  company : " + var.getCompany());
        }
    }

}
