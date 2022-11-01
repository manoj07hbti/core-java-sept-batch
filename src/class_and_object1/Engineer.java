package class_and_object1;

public class Engineer {

    int id;
    String name;
    String branch;
    double marks;

    public Engineer(int id, String name, String branch, double marks) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public static void main(String[] args) {

        Engineer Engg = new Engineer(11, "Jaydeep","IT",56.05);
        Engineer Engg1 = new Engineer(56, "Mohan","IT",90.05);
        Engineer Engg2 = new Engineer(45, "Raj","IT",76.05);
        Engineer Engg3 = new Engineer(87, "Akash","IT",37.05);
        Engineer Engg4 = new Engineer(34, "Aman","IT",66.05);
        System.out.println("Name: "+Engg. name+" id: "+Engg. id+" marks: "+Engg. marks+"branch"+Engg1.branch);
        System.out.println("Name: "+Engg1.name+" id: "+Engg1.id+" marks: "+Engg1.marks+"branch"+Engg1.branch);
        System.out.println("Name: "+Engg2.name+" id: "+Engg2.id+" marks: "+Engg2.marks+"branch"+Engg1.branch);
        System.out.println("Name: "+Engg3.name+" id: "+Engg3.id+" marks: "+Engg3.marks+"branch"+Engg1.branch);
        System.out.println("Name: "+Engg4.name+" id: "+Engg4.id+" marks: "+Engg4.marks+"branch"+Engg1.branch);

    }
}
