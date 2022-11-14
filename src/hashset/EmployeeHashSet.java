package hashset;

import model.Employee;

import java.util.HashSet;

public class EmployeeHashSet {

    // create method
    public HashSet<Employee> createEmployeeHashSet() {

        // Todo Syntax : HashSet<DataType>objectName = new HashSet<>();
        HashSet<Employee> employeesHashSet = new HashSet<>();
        Employee employee1 = new Employee(27, "jaydeep", "IT");
        Employee employee2 = new Employee(22, "Aman", "CS");
        Employee employee3 = new Employee(22, "Neeraj", "IT");
        Employee employee4 = new Employee(27, "jaydeep", "IT");
        Employee employee5 = new Employee(22, "Aman", "CS");

        //  adding data to list
        employeesHashSet.add(employee1);
        employeesHashSet.add(employee2);
        employeesHashSet.add(employee3);
        employeesHashSet.add(employee4);
        employeesHashSet.add(employee5);

        return employeesHashSet;

    }
     // main method
    public static void main(String[] args) {

        // create object by the constructor

        // Todo Syntax : ClassName objName = new ClassName();
        EmployeeHashSet obj = new EmployeeHashSet();
        HashSet<Employee> employeeHashSet = obj.createEmployeeHashSet();

        //Using Advance for loop
        // Todo Advance for loop : for(DataType var : Array/Collection) {code}
        for (Employee var : employeeHashSet) {
            System.out.println("Printing Name : " + var.getName() + " : " + (" Printing Age : " + var.getAge()) + " : " + "Printing Department : " + var.getDepartment());


        }
    }
}
