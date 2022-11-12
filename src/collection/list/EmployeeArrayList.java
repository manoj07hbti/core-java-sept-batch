package collection.list;

import modal.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {


    public ArrayList<Employee> EmployeeList(){

        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

        Employee emp1 = new Employee("Shivani", 12000,"TCS");
        Employee emp2 = new Employee("Parth", 34000,"MAHINDRA");

        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);

        return employeeArrayList;

    }

    public static void main(String[] args) {

        EmployeeArrayList obj = new EmployeeArrayList();
        ArrayList<Employee> employeeArrayList= obj.EmployeeList();

        for(Employee var : employeeArrayList){

            System.out.println("Printing employee name : " +var.getName()+ "   id  : " +var.getSalary()+
                    "    salary  : "  +var.getSalary()+ "   company  :  "+var.getCompany());

        }
    }
}
