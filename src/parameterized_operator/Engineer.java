package parameterized_operator;

public class Engineer {


    String name;
    int age;
    String branch;

    public Engineer(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public static void main(String[] args){

        Engineer eng = new Engineer("Piyush" ,30, "Electrical");
        System.out.println("Name: " +eng.name+ " Age: " +eng.age+ " Branch: " +eng.branch);

        Engineer eng2= new Engineer("Mohit", 26,  "CS");
        System.out.println("Name: " +eng2.name+ " Age: " +eng2.age+ " Branch: " +eng2.branch);

        Engineer eng3= new Engineer("Deepak",27, "Civil");
        System.out.println("Name: " +eng3.name+ " Age: " +eng3.age+ " Branch: " +eng3.branch);
    }


}
