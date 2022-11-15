package assignment.assignmentHashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap_DoubleInt {


    public HashMap <Double,Double> createMapDouble(){

        HashMap <Double,Double> studentMarks = new HashMap<Double, Double>();


        studentMarks.put(20.37,33.32);
        studentMarks.put(22.37,23.32);
        studentMarks.put(24.37,20.32);


        System.out.println("Printing Map : " + studentMarks);
        return (studentMarks);


    }


    public static void main(String[] args) {


        HashMap_DoubleInt objDouble = new HashMap_DoubleInt();
        HashMap <Double,Double> studentMarks = objDouble.createMapDouble();

        Set <Double> keys  = studentMarks.keySet() ;
        for(double var: keys ){

            System.out.println("Printing Student Marks : " + studentMarks.get(var));

        }



    }
}
