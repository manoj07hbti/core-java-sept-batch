package collection.list;

import modal.Doctor;

import java.util.ArrayList;

public class DoctorArrayList {

    public ArrayList<Doctor> DoctorList() {

        ArrayList<Doctor> doctorArrayList = new ArrayList<Doctor>();

        Doctor doctor1 = new Doctor("SHIVANI", 12, "AGRA");
        Doctor doctor2 = new Doctor("Parth", 15, "delhi");

        doctorArrayList.add(doctor1);
        doctorArrayList.add(doctor2);

        return doctorArrayList;
    }


    public static void main(String[] args) {
        DoctorArrayList obj = new DoctorArrayList();
        ArrayList<Doctor> doctorArrayList = obj.DoctorList();

        for (Doctor var : doctorArrayList) {

            System.out.println(" Printing data:   name : " + var.getName() + "   id  : " + var.getId() +
                    "  location  :  " + var.getLocation());

        }

    }
}