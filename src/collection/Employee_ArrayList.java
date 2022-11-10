 package collection;

import model.Employee;

import java.util.ArrayList;

 public class Employee_ArrayList {

     // create method

     public ArrayList<Employee> crateEmployeeList() {

         // Todo Syntax : CollectionName  objectName = new CollectionName ();

         ArrayList<Employee> employeesArrayList = new ArrayList<>();

         // now we need to add information about employees

         Employee employee1 = new Employee("Raj", 23, "Engineer");
         Employee employee2 = new Employee("Rahul", 43, "Police");
         Employee employee3 = new Employee("Ram", 26, "Teacher");
         Employee employee4 = new Employee("Anuj", 42, "Advocate");

         //  adding data to list

         employeesArrayList.add(employee1);
         employeesArrayList.add(employee2);
         employeesArrayList.add(employee3);
         employeesArrayList.add(employee4);

         return employeesArrayList;

     }

     public static void main(String[] args) {
         // create object by the constructor
         // ClassName objName = new ClassName();
         Employee_ArrayList obj = new Employee_ArrayList();
         ArrayList<Employee> employeeArrayList = obj.crateEmployeeList();


         for (int i = 0; i < employeeArrayList.size(); i++) {


             System.out.println("printing : " + employeeArrayList.get(i).getName() + "Age : " + employeeArrayList.get(i).getAge() + " Dept : " + employeeArrayList.get(i).getDepartment());
         }
     }

 }
