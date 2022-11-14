package Package_9_Collection_framework.hashset;

import model.Doctor;

import java.util.HashSet;

public class Doctor_hashset {
public  HashSet<Doctor> DoctorInfo(){
    HashSet<Doctor> DoctorDetails = new HashSet<>();
    Doctor doc1 = new Doctor("Rakesh sharma","Ortho",20);
    Doctor doc2 = new Doctor("Mukesh kumar","ENT",18);
    Doctor doc3 = new Doctor("Abhinav sharma","neuroSurgeon ",22);
    Doctor doc4 = new Doctor("Rakesh kumar","Ortho",20);
    Doctor doc5 = new Doctor("Abhinav sharma","neuroSurgeon ",22);
    DoctorDetails.add(doc1);
    DoctorDetails.add(doc2);
    DoctorDetails.add(doc3);
    DoctorDetails.add(doc4);
    DoctorDetails.add(doc5);
return DoctorDetails;
}

    public static void main(String[] args) {
        Doctor_hashset obj = new Doctor_hashset();
        HashSet<Doctor> DoctorDetails = obj.DoctorInfo();
        for (Doctor element: DoctorDetails) {
            System.out.println(element.getName()+", "+element.getSpecialization()+", "+element.getExperience() +", has hashcode: "+ element.hashCode());
        }

    }
}
