package class_object1;

public class Engineer {

    // Todo : Engineer properties
    String name;
    int age;
    String dpt;

    // Todo : Parameter Constructor
    public Engineer(String name, int age, String dpt) {
        this.name = name;
        this.age = age;
        this.dpt = dpt;
    }
    // Todo : main method
    public static void main(String[] args) {

        // Todo : create object by the constructor

        //Todo Syntax : ClassName objectName = new ClassName(Parameter1,Parameter2,Parameter,.......);
                        Engineer engineer = new Engineer("Rahul",34,"IT");
                        System.out.println("Engineer name is : " + engineer.name);
                        System.out.println("Age is : " + engineer.age);
                        System.out.println("Department name is : " + engineer.dpt);

System.out.println("Engineer name is : " + engineer.name+","+"Age is : " + engineer.age+","+"Department name is : " + engineer.dpt);

    }
}
