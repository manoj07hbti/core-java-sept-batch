package hashset;

import model.Doctor;

import java.util.HashSet;

public class Doctor_Hashset {
    public HashSet<Doctor> DoctorList(){

        HashSet<Doctor>Doctor_Hashset=new HashSet<>();

        Doctor Doctor1=new Doctor("Dr:Ravi","Mumbai",39,"Shanu:","infection");
        System.out.println("printing Doctor1:" + Doctor1.hashCode());
        Doctor Doctor2=new Doctor("Dr:Deepak","Goa",45,"Rahul:","Heart block");
        System.out.println("printing Doctor2:" + Doctor2.hashCode());
        Doctor Doctor3=new Doctor("Dr:Ravi","Delhi",51,"Shivam:","Liver infection");
        System.out.println("printing Doctor3:" + Doctor3.hashCode());
        Doctor Doctor4=new Doctor("Dr:Ravi","Kanpur",49,"Kalpana:","infection heart");
        System.out.println("printing Doctor4:" + Doctor4.hashCode());
        Doctor Doctor5=new Doctor("Dr:Ravi","Delhi",51,"Shivam:","Liver infection");
        System.out.println("printing Doctor5:" + Doctor5.hashCode());
        Doctor Doctor6=new Doctor("Dr:Ravi","Kanpur",49,"Kalpana:","infection heart");
        System.out.println("printing Doctor6:" + Doctor1.hashCode());


        Doctor_Hashset.add(Doctor1);
        Doctor_Hashset.add(Doctor2);
        Doctor_Hashset.add(Doctor3);
        Doctor_Hashset.add(Doctor4);
        Doctor_Hashset.add(Doctor5);
        Doctor_Hashset.add(Doctor6);

        return Doctor_Hashset;

    }
    public static void main(String[]Args){

        Doctor_Hashset obj=new Doctor_Hashset();
        HashSet<Doctor>Doctor_Hashset=new HashSet<>();

        for(Doctor var: obj.DoctorList()){

            System.out.println("printing Name:"+var.getName()+ "place:"+var.getPlace()+ "age:"+var.getAge() +"patient:"+var.getPatient()+ "disease:"+var.getDisease());

        }




    }




}
