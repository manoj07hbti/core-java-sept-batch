package khushi_gautam.collection.HashSet;
import khushi_gautam.collection.model.*;

import java.util.HashSet;

public class DoctorHashSet {
    public HashSet<Doctor> createHashSet (){
        HashSet <Doctor> d = new HashSet<>();
        //todo SYNTAX: HashSet <DataType> objName = new HashSet<> ();
        Doctor d1= new Doctor("Dr. Ramesh","JNM",4,"MD");
        System.out.println("Printing hashcode of doctor1: "+d1.hashCode());

        Doctor d2 = new Doctor("Dr. Rohini","JNM",7,"surgeon");
        System.out.println("Printing hashcode of doctor2: "+d2.hashCode());

        Doctor d3 = new Doctor("Dr. Harsha","JNM",9,"Technician");
        System.out.println("Printing hashcode of doctor3: "+d3.hashCode());

        Doctor d4 = new Doctor("Dr. Amit","JNM",7,"neurologist");
        System.out.println("Printing hashcode of doctor4: "+d4.hashCode());

        Doctor d5 = new Doctor("Dr. Rohini","JNM",7,"surgeon");
        System.out.println("Printing hashcode of doctor5: "+d5.hashCode());

        Doctor d6 = new Doctor("Dr. Harsha","JNM",9,"Technician");
        System.out.println("Printing hashcode of doctor6: "+d6.hashCode());

        Doctor d7= new Doctor("Dr. Ramesh","JNM",4,"MD");
        System.out.println("Printing hashcode of doctor7: "+d7.hashCode());

        d.add(d1);
        d.add(d2);
        d.add(d3);
        d.add(d4);
        d.add(d5);
        d.add(d6);
        d.add(d7);

        return d;
    }

    public static void main(String[] args) {
        DoctorHashSet obj = new DoctorHashSet();
        HashSet <Doctor> d=obj.createHashSet();
        System.out.println("printing detail of the doctors ");
        for (Doctor var: d){
            System.out.println(var.getName()+" Hospital: "+ var.getHospital()
                    +" exerience: "+ var.getExperience()+ " post: "+var.getPost());
        }
    }
}
