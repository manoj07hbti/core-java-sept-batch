package class_object;

public class Engineer {

    String name;
    String department;
    int salary;


    public Engineer(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Engineer engineer=new Engineer("Sagar","Civil",45000);
        System.out.println(" Name : " +engineer.name+ " Department : " +engineer.department + " Salary : " +engineer.salary);
    }
}
