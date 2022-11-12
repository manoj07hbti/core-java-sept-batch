package khushi_gautam.collection.HashSet;
import khushi_gautam.collection.model.Employee;

import java.util.HashSet;

public class EmployeeHashSet {
    public HashSet<Employee> employeeHashSet(){
        HashSet<Employee> E = new HashSet<>();
        Employee e1 = new Employee("Suresh","Goggle",5,"Technician");
        Employee e2 = new Employee("Surita","Goggle",4,"Senior developer");
        Employee e3 = new Employee("Diksha","Goggle",7,"Programmer");
        Employee e4 = new Employee("Soni","Goggle",9,"Developer");
        Employee e5 = new Employee("Surita","Goggle",4,"Senior developer");
        Employee e6 = new Employee("Diksha","Goggle",7,"Programmer");

        //todo using hashcode
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e5.hashCode());
        System.out.println(e6.hashCode());

        E.add(e1);
        E.add(e2);
        E.add(e3);
        E.add(e4);
        E.add(e5);
        E.add(e6);

        return E;
    }

    public static void main(String[] args) {
        EmployeeHashSet obj = new EmployeeHashSet();
        HashSet<Employee> E =obj.employeeHashSet();

        System.out.println("Printing detail of employees");
        for (Employee var: E){
            System.out.println(" Name: "+var.getName()+" Company: "+var.getCompany()+
                    " Experience: "+var.getExperience()+" Post: "+var.getPost());
        }
    }
}
