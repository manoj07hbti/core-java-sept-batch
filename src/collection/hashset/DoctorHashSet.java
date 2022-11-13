package collection.hashset;

import modal.Doctor;

import java.util.HashSet;

public class DoctorHashSet {

    public HashSet<Doctor> doctorHashSet(){

        HashSet<Doctor> doctorHashSet = new HashSet<>();

        Doctor doc1 = new Doctor("ram", 50, "agra");
        System.out.println("hash code of doc1  :" +doc1.hashCode()) ;


        Doctor doc2 = new Doctor("shyam", 85, "Delhi");
        System.out.println("hash code of doc2   :"  +doc2.hashCode());


        Doctor doc3 = new Doctor("ram", 50, "agra");
        System.out.println("hash code of doc3 :" +doc3.hashCode()) ;

        doctorHashSet.add(doc1);
        doctorHashSet.add(doc2);
        doctorHashSet.add(doc3);

        return doctorHashSet;

    }

    public static void main(String[] args) {

        DoctorHashSet obj = new DoctorHashSet();

        HashSet<Doctor> doctorHashSet= obj.doctorHashSet();

        for (Doctor var : doctorHashSet){

            System.out.println("Printing data :  " +var.getName()+ "    id : " +var.getId()+  "  location : "   +var.getLocation());
        }


    }
}
