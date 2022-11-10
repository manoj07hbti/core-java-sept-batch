package Package_9_Collection_framework;

import model.Doctor;

import java.util.ArrayList;

public class Doctor_Arraylist {
    public ArrayList<Doctor> doctorInfo(){
        ArrayList<Doctor> doctorArrayList = new ArrayList<>();
        Doctor doc1 = new Doctor("Anil kumar", "Orthopedist", 20);
        Doctor doc2 = new Doctor("Rakesh Astana", "Neurosurgeon", 18);
        Doctor doc3 = new Doctor("Ravi kumar"," ENT specialist",23);
        doctorArrayList.add(doc1);
        doctorArrayList.add(doc2);
        doctorArrayList.add(doc3);
        return doctorArrayList;
    }

    public static void main(String[] args) {
        Doctor_Arraylist obj = new Doctor_Arraylist();
        ArrayList<Doctor> doctorArrayList = obj.doctorInfo();
        for (int i=0; i<doctorArrayList.size();i++){
            System.out.println("Doctor "+(i+1)+" deatils");
            System.out.println("Name: "+doctorArrayList.get(i).getName()+" ,Specialization: "+doctorArrayList.get(i).getSpecialization()+" ,years of experience: "+doctorArrayList.get(i).getExperience());
        }
    }
}
