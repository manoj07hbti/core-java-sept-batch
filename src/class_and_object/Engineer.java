package class_and_object;

public class Engineer {
    String name;
    String branch;
    long rollNumber;

    public Engineer(String name, String branch, long rollNumber) {
        this.name = name;
        this.branch = branch;
        this.rollNumber = rollNumber;
    }
    public static void main(String[] args) {
        Engineer eng1= new Engineer("Rahul","EE", 1500420901);
        Engineer eng2= new Engineer("Rohit","ME", 1500420902);
        Engineer eng3= new Engineer("Ravi","CE", 1500420903);
        System.out.println("---Engineer 1 details---");
        System.out.println("Name: " + eng1.name+"\n"+"Branch: "+eng1.branch+"\n"+"Roll Number: "+eng1.rollNumber);
        System.out.println("---Engineer 2 details---");
        System.out.println("Name: " + eng2.name+"\n"+"Branch: "+eng2.branch+"\n"+"Roll Number: "+eng3.rollNumber);
        System.out.println("---Engineer 3 details---");
        System.out.println("Name: " + eng3.name+"\n"+"Branch: "+eng3.branch+"\n"+"Roll Number: "+eng3.rollNumber);
    }
}
