package collection.hashSet;


import model.Employee;

import java.util.HashSet;

public class EmployeeHashSet {

    // create method
    public HashSet<Employee> createEmployeeHashSet() {

        // Todo Syntax : HashSet<DataType>objectName = new HashSet<>();

        HashSet<Employee> employeesHashSet = new HashSet<>();

        Employee employee1 = new Employee("Rohit",   23, "Engineer");
        Employee employee2 = new Employee("Yogesh",  31, "Police");
        Employee employee3 = new Employee("Prakash", 22, "Teacher");
        Employee employee4 = new Employee("Yogesh",  31, "Police");
        Employee employee5 = new Employee("Prakash", 22, "Teacher");

        //  adding data to list
        employeesHashSet.add(employee1);
        employeesHashSet.add(employee2);
        employeesHashSet.add(employee3);
        employeesHashSet.add(employee4);
        employeesHashSet.add(employee5);

        return employeesHashSet;

    }

    public static void main(String[] args) {

        // create object by the constructor

        // ClassName objName = new ClassName();
        EmployeeHashSet obj = new EmployeeHashSet();
        HashSet<Employee> employeeHashSet = obj.createEmployeeHashSet();

        //Using Advance for loop
        // Todo Advance for loop : for(DataType var : Array/Collection) {code}
        for (Employee var : employeeHashSet) {
            System.out.println("Printing Name : " + var.getName() + " : " + ( " Printing Age : " + var.getAge()) + " : " + "Printing Department : " + var.getDepartment());


        }
    }
}
