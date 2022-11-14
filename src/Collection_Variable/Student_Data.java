package Collection_Variable;

import StudentData.Demo_Data;

import java.util.ArrayList;

public class Student_Data {

    public ArrayList<Demo_Data> schoolData(){

        //TODO SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();

        ArrayList<Demo_Data> Student_data= new ArrayList<>();

        Demo_Data Data1= new Demo_Data("01","Akash","45","Mechanical","A");
        Demo_Data Data2= new Demo_Data("02","Rajesh","21","IT","B");
        Demo_Data Data3= new Demo_Data("03","Ramesh","15","Civil","A");
        Demo_Data Data4= new Demo_Data("04","Pratiksha","02","C.S","C");

        Student_data.add(Data1);
        Student_data.add(Data2);
        Student_data.add(Data3);
        Student_data.add(Data4);
        return Student_data;
    }


    public static void main(String args[]){
        Student_Data obj= new Student_Data();
        ArrayList<Demo_Data> Student_data= obj.schoolData();

       System.out.println("");


    }
}
