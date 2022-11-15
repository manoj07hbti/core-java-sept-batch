package collection;

import model.Doctor;

import java.util.ArrayList;

public class DoctorVilla { // Todo first create a method which will create doctorArrayList

    public ArrayList<Doctor> Doctorshisab() {
//TODO SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();


        ArrayList<Doctor> pilla = new ArrayList<>();

        Doctor std1=new Doctor("aaa", "bbbb", 111);
        Doctor std2=new Doctor("ccc", "ddd", 2222);

        pilla.add(std1);
        pilla.add(std2);

        return pilla;
    }


    public static void main(String[] args) {

        DoctorVilla obj=new DoctorVilla();
        ArrayList<Doctor>Doctorshisab=obj.Doctorshisab();

        for (int i=0; i<Doctorshisab.size(); i++){
            System.out.println(Doctorshisab.get(i).getName()+ Doctorshisab.get(i).getYear());
        }


    }
}