package class_and_object1;

import javax.xml.namespace.QName;

public class Engineer {
    String name;
    int RollNo;
    String Branch;
    long contact;

    public Engineer(String name, int rollNo, String branch, long contact) {
        this.name = name;
        RollNo = rollNo;
        Branch = branch;
        this.contact = contact;
    }

    public static void main(String[] args) {
        Engineer obj=new Engineer("Himanshu Singh",1904320019,"mechanical",8865840081l);
        System.out.println("Student Name:"+obj.name);
        System.out.println("RollNo:" +obj.RollNo);
        System.out.println("Branch:" +obj.Branch);
        System.out.println("Contact:" +obj.contact);

        Engineer obj1=new Engineer("Rahul Kumar",1904331250,"Civil Engineering",6352417895l);

        System.out.println("Student Name:"+obj1.name);
        System.out.println("RollNo:" +obj1.RollNo);
        System.out.println("Branch:" +obj1.Branch);
        System.out.println("Contact:" +obj1.contact);

    }
}
