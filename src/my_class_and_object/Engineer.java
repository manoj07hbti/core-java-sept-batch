package my_class_and_object;

public class Engineer {
    String Name;
    int empId;
    String dept;
    String Loc;

    public Engineer(String name, int empId, String dept, String loc) {
        Name = name;
        this.empId = empId;
        this.dept = dept;
        Loc = loc;
    }

    public static void main(String[] args)
    {
        Engineer obj1 = new Engineer("Gyanendra",0103,"IT","Delhi NCR");
        System.out.println("Engineer Name :"+obj1.Name +"  EmpID"+obj1.empId+"   Department :"+obj1.dept+"   Location :"+obj1.Loc);
        Engineer obj2 = new Engineer("Surendra",0115,"Civil","Bilaspur");
        System.out.println("Engineer Name :"+obj2.Name +"  EmpID"+obj2.empId+"   Department :"+obj2.dept+"   Location :"+obj2.Loc);
    }
}
