package Package_9_Collection_framework.arraylist;

import model.Employee;

import java.util.ArrayList;

public class Employee_arraylist {
    public ArrayList<Employee> employee(){
        ArrayList<Employee> EmpDetails = new ArrayList<>();
        Employee emp1 = new Employee("Rahul Verma", 101,55000.00);
        Employee emp2 = new Employee("Sachin Verma", 102, 56000.75);
        Employee emp3 = new Employee("Saurabh Verma",103,51000.50);
        EmpDetails.add(emp1);
        EmpDetails.add(emp2);
        EmpDetails.add(emp3);
        return EmpDetails;
    }

    public static void main(String[] args) {
        Employee_arraylist obj = new Employee_arraylist();
        ArrayList<Employee> EmpDetails = obj.employee();
        System.out.println("Name: "+EmpDetails.get(1).getName()+" ,Id: "+EmpDetails.get(1).getId()+" ,Salary: "+EmpDetails.get(1).getSalary());
        System.out.println("=======*BY FOR LOOP*=========");
             for (int i=0; i<EmpDetails.size();i++){
                 System.out.println("Employee "+(i+1)+" Details");
                 System.out.println("Name: "+EmpDetails.get(i).getName()+" ,Id: "+EmpDetails.get(i).getId()+" ,Salary: "+EmpDetails.get(i).getSalary());
        }
    }
}
