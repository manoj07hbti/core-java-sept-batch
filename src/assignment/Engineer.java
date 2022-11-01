package assignment;

public class Engineer {
    String name;
    String branch;
    int age;
    // parameterized constructor
    public Engineer(String name, String branch, int age) {
        this.name = name;
        this.branch = branch;
        this.age = age;
    }

    public static void main(String[] args) {
         Engineer engg = new Engineer("Mangesh","Computer Science",35);
        System.out.println( "Name :-" + engg.name + " Branch :-" + engg.branch + " Age :-" +engg.age );

        Engineer engg1 = new Engineer("Pavan","Information Technology",38);
        System.out.println( "Name :-" + engg1.name + " Branch :-" + engg1.branch + " Age :-" +engg1.age );
    }
}
