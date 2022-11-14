package khushi_gautam.collection.HashSet;
import  khushi_gautam.collection.model.*;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

    LinkedHashSet <Doctor>  createLinkedHashSet() {
        LinkedHashSet<Doctor> D = new LinkedHashSet<>();
        Doctor d1 = new Doctor("Dr. Ramesh,", "JNM,", 4, "MD");
        Doctor d2 = new Doctor("Dr. Rohini,", "JNM,", 7, "surgeon");
        Doctor d3 = new Doctor("Dr. Harsha,", "JNM,", 9, "Technician");
        Doctor d4 = new Doctor("Dr. Amit,", "JNM,", 7, "neurologist");

        D.add(d1);
        D.add(d2);
        D.add(d3);
        D.add(d4);
        return D;
    }

    public static void main(String[] args) {
        DemoLinkedHashSet obj = new DemoLinkedHashSet();
        LinkedHashSet<Doctor> D = obj.createLinkedHashSet();
        for (Doctor var:D){
            System.out.println(var.getName()+" Hospital: "+ var.getHospital()
                    +" exerience: "+ var.getExperience()+ ", post: "+var.getPost());
        }
    }
}
