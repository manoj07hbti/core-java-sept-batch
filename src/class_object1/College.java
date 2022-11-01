package class_object1;

import javax.imageio.stream.ImageInputStream;

public class College {

    //Todo : properties

    String collegeName;
    int totalTeachers;
    String principalName;
    int collegeFees;
    double distance;

    // Todo : Parameter Constructor

    public College(String collegeName, int totalTeachers, String principalName, int collegeFees, double distance) {
        this.collegeName = collegeName;
        this.totalTeachers = totalTeachers;
        this.principalName = principalName;
        this.collegeFees = collegeFees;
        this.distance = distance;
    }

    // main method
        public static void main(String[] args) {

        //Todo : create object by the constructor method
 // Todo Syntax :ClassName objectName = new ClassName ( Parameter1,parameter2,parameter3,......);
                 College college = new College("Vijay Lakshmi",15,"Vijay",10600,6.2);

            System.out.println("My college name is : " + college.collegeName);
            System.out.println("TotalTeachers : " + college.totalTeachers);
            System.out.println("Principal name is : " + college.principalName);
            System.out.println("TotalCollege fees : " + college.collegeFees);
            System.out.println("Distance : " + college.distance);

    }
}
