package collection_demo1.list_demo;

import model.Employee;

import java.util.ArrayList;

public class Employee_Array_List {


    public ArrayList<Employee> createEmployeeList(){

        ArrayList<Employee> EmployeeArrayList=new ArrayList<>();

        Employee employee1=new Employee(34,"Amit","IT");

        Employee employee2=new Employee(45,"Rahul","Police");

        Employee employee3=new Employee(19,"Pankaj","CIVIL");

        Employee employee4=new Employee(56,"Karan","CS");


        EmployeeArrayList.add(employee1);

        EmployeeArrayList.add(employee2);

        EmployeeArrayList.add(employee3);

        EmployeeArrayList.add(employee4);

        return EmployeeArrayList;

    }

    public static void main(String[] args) {

        Employee_Array_List obj=new Employee_Array_List();

          ArrayList<Employee> employeeArrayList=obj.createEmployeeList();

          for(int i=0;i<employeeArrayList.size();i++){

              System.out.println("printing employee array list----"+
                     "name---" +employeeArrayList.get(i).getName()+  "---Age---"+employeeArrayList.get(i).getAge()+"---Dept---"+employeeArrayList.get(i).getDepartment());
          }


    }
}
