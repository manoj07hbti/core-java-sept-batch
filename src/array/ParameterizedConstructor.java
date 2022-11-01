package array;

public class ParameterizedConstructor {
    String student;
        int RollNumber;
        String branch;
//parameterized Constructor


    public ParameterizedConstructor(String student, int rollNumber, String branch) {
        this.student = student;
        RollNumber = rollNumber;
        this.branch = branch;}

    public static void main(String[] args) {

        ParameterizedConstructor obj=new  ParameterizedConstructor("VISHAL",2004320906,"Electrical Engineering");
        System.out.println("Student Name:"+obj.student+" Roll Number:"+obj.RollNumber+" Branch:"+obj.branch);
        ParameterizedConstructor obj2=new ParameterizedConstructor("AKASH",2004320905,"Mechanical Engineering");
        System.out.println("Student Name:"+obj2.student+" Roll Number:"+obj2.RollNumber+" Branch:"+obj2.branch);

    }
}




