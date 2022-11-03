package methods;

public class Stud_ObjCopy {
 int rollno;
 String name;

// TODO : to copy the value of one object into another using java constructor.

    public Stud_ObjCopy(int rNo, String n) {
        rollno = rNo;
        name = n;
    }
    public Stud_ObjCopy(Stud_ObjCopy s) {
        rollno = s.rollno;
        name = s.name;
    }
 void display()
 {
     System.out.println(rollno+"  "+name);
 }

    public static void main(String[] args) {

        Stud_ObjCopy s1 = new Stud_ObjCopy(8456,"Sohan");
        Stud_ObjCopy s2 = new Stud_ObjCopy(s1);
        s1.display();
        s2.display();
    }

}
