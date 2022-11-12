package khushi_gautam.collection.list;
import khushi_gautam.collection.model.*;
import java.util.ArrayList;

public class DoctorArrayList {
    public ArrayList<Doctor> doctorList(){
        //todo syntax: collectionName objName = new CollectionName();
        ArrayList<Doctor> D = new ArrayList<>();
        Doctor D1= new Doctor("Dr.Roopa","AIMS",7,"MD");
        Doctor D2= new Doctor("Rohit","JNM",9,"MS");
        Doctor D3= new Doctor("Kunal","BHU",8,"GNM");

        D.add(D1);
        D.add(D2);
        D.add(D3);

        return D ;
    }

    public static void main(String[] args) {
        DoctorArrayList obj = new DoctorArrayList();
        ArrayList<Doctor> D =obj.doctorList();
        System.out.println("printing doctor details");
        for (Doctor var: D){
            System.out.println("Name: "+var.getName()+" Hospital: "+var.getHospital()
                    +" Experience: "+var.getExperience()+" Post: "+var.getPost());
        }
        //todo using setter method for changing data command in future
        D.get(0).setPost("MS");
        D.get(2).setHospital("AIMS");
    }
}
