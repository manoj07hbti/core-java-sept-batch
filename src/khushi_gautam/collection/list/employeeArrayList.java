package khushi_gautam.collection.list;

import khushi_gautam.collection.model.Employee;

import java.util.ArrayList;

public class employeeArrayList {
    public  ArrayList<Employee> employeeList(){
        //todo syntax: collectionName objName = new CollectionName();
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Employee num1 = new Employee("Rohit","Infosys",4,"developer");
        Employee num2 = new Employee("Raj","Schilcher",5,"Manager");
        Employee num3 = new Employee("Pradeep","Schilcher",5,"Manager");
        Employee num4 = new Employee("Arti","Schilcher",2,"Developer");

        employeeArrayList.add(num1);
        employeeArrayList.add(num2);
        employeeArrayList.add(num3);
        employeeArrayList.add(num4);

        return employeeArrayList;
    }

    public static void main(String[] args) {
        employeeArrayList obj= new employeeArrayList();
        ArrayList<Employee> employeeArrayList = obj.employeeList();
        for (int i=0;i<employeeArrayList.size();i++){
            System.out.println(employeeArrayList.get(i).getName()+", company - "+employeeArrayList.get(i).getCompany()
                    +" , experience-  "+employeeArrayList.get(i).getExperience()+" , Post- "+employeeArrayList.get(i).getPost());

        }
    }
}
