package Collection;

import model.Doctor;
import model.Employee;

import java.util.ArrayList;

public class EmployeeList {

    public ArrayList<Employee> employeeList(){

        ArrayList<Employee>employees= new ArrayList();

        Employee employee1=new Employee("Shanu",30,"kanpur","It");
        Employee employee2=new Employee("Deepak",31,"Delhi","It");
        Employee employee3=new Employee("Ravi",26,"Shuklagaj","It");
        Employee employee4=new Employee("Avinash",30,"Delhi","It");
        Employee employee5=new Employee("Raj",31,"Goa","It");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        return employees;

    }

    public static void main(String[]args){

        EmployeeList employeeList=new EmployeeList();
        ArrayList<Employee>employeeList1=  employeeList.employeeList();
        for (int i=0; i<employeeList.employeeList().size();i++){
            System.out.println("Employee:"+(i+1)+":");
            System.out.println("Employee: :"+employeeList1.get(i).getName()+":"  +"place:"+employeeList1.get(i).getPlace()+":"   + "age:"+employeeList1.get(i).getAge()+":"  +"sector:"+employeeList1.get(i).getSector());



        }



    }


    }



