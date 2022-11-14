package collection.hashset;

import model.Doctor;

import java.util.HashSet;

public class DoctorHashSet {

    public HashSet<Doctor> DoctorSet(){

        //SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();

        HashSet <Doctor> DoctorHashSet = new HashSet<>();

        // now we need to add information about employees

        Doctor obj1 = new Doctor("Arun Gupta" , 40, "Orthopaedic");
        System.out.println("Printing hashcode of Doctor 1: "+obj1.hashCode());
        Doctor obj2 = new Doctor("Lalit Juneja ",55, "Dermatologist");
        System.out.println("Printing hashcode of Doctor 2: "+obj2.hashCode());
        Doctor obj3 = new Doctor("Arun Gupta", 40 , "Orthopaedic");
        System.out.println("Printing hashcode of Doctor 3: "+obj3.hashCode());
        Doctor obj4 = new Doctor("Lalit Juneja ",55, "Dermatologist");
        System.out.println("Printing hashcode of Doctor 4: "+obj4.hashCode());
        Doctor obj5 = new Doctor("Ram Sharma",60, "Surgeon");
        System.out.println("Printing hashcode of Doctor 5: "+obj5.hashCode());

        // adding data to the list

        DoctorHashSet.add(obj1);
        DoctorHashSet.add(obj2);
        DoctorHashSet.add(obj3);
        DoctorHashSet.add(obj4);
        DoctorHashSet.add(obj5);

        return DoctorHashSet;

    }

    public static void main(String[] args) {

        DoctorHashSet obj = new DoctorHashSet();

        HashSet<Doctor> DoctorHashSet=  obj.DoctorSet();

        for ( Doctor var: DoctorHashSet)


            System.out.println("Printing "+var.getName()+ "  Age  : "+var.getAge()+ " Branch : "+var.getBranch());
    }


}
