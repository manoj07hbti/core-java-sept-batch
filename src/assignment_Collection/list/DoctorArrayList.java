package assignment_Collection.list;

import model.doctor;

import java.util.ArrayList;

public class DoctorArrayList {
    //create a method which will create doctor arraylist

    public ArrayList<doctor> createDoctorArrayList(){

        //TODO SYNTAX: CollectionName < DataType> objName = new CollectionName<>();

        ArrayList<doctor> doctorArrayList = new ArrayList<>();

        //  now we add to information about doctor

        doctor doctor1 = new doctor(1,"Ramesh","Apollo");
        doctor doctor2 = new doctor(1,"Mahesh","Medanta");
        doctor doctor3 = new doctor(1,"Ramesh","J.P");

        doctorArrayList.add(doctor1);
        doctorArrayList.add(doctor2);
        doctorArrayList.add(doctor3);

        return  doctorArrayList;

    }


    public static void main(String[] args) {

        DoctorArrayList obj = new DoctorArrayList();

        ArrayList <doctor> doctorArrayList = obj.createDoctorArrayList();

        for(int i = 0 ; i<doctorArrayList.size() ; i++){

            System.out.println("Printing : " + doctorArrayList.get(i).getName());
            System.out.println("Printing : " + doctorArrayList.get(i).getId());
            System.out.println("Printing : " + doctorArrayList.get(i).getHospName());

        }

    }
}
