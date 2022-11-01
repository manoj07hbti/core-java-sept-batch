package khushi_gautam;

import java.util.concurrent.Callable;

public class College {
    String college;
    String department;
    String MD;
    int Student;

    // parametrized constructor


    public College(String college, String department, String MD, int student) {
        this.college = college;
        this.department = department;
        this.MD = MD;
        Student = student;
    }

    public static void main(String[] args) {
        College clg= new College("JMC","X-Ray","Dr.Raseed",123);
        College clg1= new College("JMC","Ultrasound","Dr.Kushik",234);
        College clg2 = new College("JMC","Dilevary","Dr.Renuka",542);

        System.out.println(" College: " + clg.college+ " Department: "+ clg.department + " MD: " + clg.MD +  " Student: " + clg.Student);
        System.out.println(" College: " +clg1.college+ " Department: " +clg1.department+ " MD: " +clg1.MD+ " Student: " +clg1.Student);
        System.out.println(" College: " +clg2.college+ " Department: " +clg2.department+ " MD: " +clg2.MD+ " Student: " +clg2.Student);

    }
}
