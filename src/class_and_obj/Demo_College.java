package class_and_obj;

public class Demo_College {

    String college;
    String branch;
    String HOD;
    int total_students;

    // parameterized constructor

    public Demo_College(String college, String branch, String HOD, int total_students) {
        this.college = college;
        this.branch = branch;
        this.HOD = HOD;
        this.total_students = total_students;
    }

    public static void main(String[] args) {

        Demo_College clg = new Demo_College(  "IPEC"  , "CS", "Mr. R.V.Rawat", 120);

        System.out.println("name: "  + clg.college+    "   branch: " + clg.branch + "  HOD: " + clg.HOD + "   total_student:  " + clg.total_students);

        Demo_College clg1 = new Demo_College(  "IPEC"  , "EE", "Mr. P.K.Sharma", 100);

        System.out.println("name: "  + clg1.college+    "   branch: " + clg1.branch + "  HOD: " + clg1.HOD + "   total_student:  " + clg1.total_students);

        Demo_College clg2 = new Demo_College(  "IPEC"  , "IT", "Mr. B.L.Mukharji", 180);

        System.out.println("name: "  + clg2.college+    "   branch: " + clg2.branch + "  HOD: " + clg2.HOD + "   total_student:  " + clg2.total_students);

        Demo_College clg3 = new Demo_College(  "IPEC"  , "ME", "Mr. P.C.Sharma", 90);

        System.out.println("name: "  + clg3.college+    "   branch: " + clg3.branch + "  HOD: " + clg3.HOD + "   total_student:  " + clg.total_students);
    }



}
