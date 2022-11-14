package assignment_Collection.hashset_demo;

import model.Employee;

import java.util.HashSet;

public class AssignmentEmployeeHashSet {

    public HashSet<Employee> createHashset(){

        HashSet<Employee> EmployeeHashset = new HashSet<>();

        Employee employee1 = new Employee(1001,"Sumit","Account");
        Employee employee2 = new Employee(1002,"Amit","Software");
        Employee employee3 = new Employee(1003,"Ankit","Civil");

        EmployeeHashset.add(employee1);
        EmployeeHashset.add(employee2);
        EmployeeHashset.add(employee3);


        return EmployeeHashset;

    }

    public static void main(String[] args) {

        AssignmentEmployeeHashSet obj = new AssignmentEmployeeHashSet();
        HashSet<Employee> employee = obj.createHashset();
        for( Employee var :  employee){
            System.out.println("Employee Id is : " + var.getEmpid() + " ,Employee Name : " +var.getEmpName()+ " ,Emp Dept. :" +var.getEmpDept());
        }



    }
}
