package assignment_class_and_object;

public class Bank {
    String name="SBI";
    int branches= 22200;
    String chairman= "Dinesh Khara";
    String my_job_profile= "clerk";

    public static void main(String[] args) {
        Bank DTE= new Bank(); // obj object created
        System.out.println("Bank name : "+DTE.name);
        System.out.println("Bank Toal Branches: "+DTE.branches);
        System.out.println("Bank Chairman : "+DTE.chairman);
        System.out.println("job profile  : "+DTE.my_job_profile);
    }


}
