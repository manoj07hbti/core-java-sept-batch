package collection.hashset;

import model.Employee;

import java.util.HashSet;

public class EmployeeHashSet {

    public HashSet<Employee> EmployeeSet(){

        //SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();

        HashSet <Employee> EmployeeHashSet = new HashSet<>();

        // now we need to add information about employees

        Employee obj1 = new Employee("Mohit" , 25, "IT");
        Employee obj2 = new Employee("Aman ",23, "CS");
        Employee obj3 = new Employee("Sumit", 24 , "nonTechnical");
        Employee obj4 = new Employee("Mohit" , 25, "IT");
        Employee obj5 = new Employee("Mohit" , 25, "IT");

        // adding data to the list

        EmployeeHashSet.add(obj1);
        EmployeeHashSet.add(obj2);
        EmployeeHashSet.add(obj3);
        EmployeeHashSet.add(obj4);
        EmployeeHashSet.add(obj5);

        return EmployeeHashSet;

    }

    public static void main(String[] args) {

        EmployeeHashSet obj = new EmployeeHashSet();

        HashSet<Employee> EmployeeHashSet=  obj.EmployeeSet();

        for ( Employee var: EmployeeHashSet)


            System.out.println("Printing "+var.getName()+ "  Rollno : "+var.getAge()+ "  Age : "+var.getBranch());
    }


}
