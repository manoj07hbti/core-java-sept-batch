package Collection;

import model.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorList {
    public ArrayList<Doctor> DoctorArrayList() {
        ArrayList<Doctor> DoctorsArraylist = new ArrayList<>();

        Doctor Doctor1 = new Doctor("Dr. raj", "Kanpur", 26, "ravi", "heart");
        Doctor Doctor2 = new Doctor("Dr.Deepak", "Delhi", 26, "Shanu", "eye");
        Doctor Doctor3 = new Doctor("Dr.Deelip", "Unnao", 28, "Heart", "heart");

        DoctorsArraylist.add(Doctor1);
        DoctorsArraylist.add(Doctor2);
        DoctorsArraylist.add(Doctor3);

        return DoctorsArraylist;

    }

    public static void main(String[] args) {
        DoctorList doctorList=new DoctorList();
        ArrayList<Doctor> DoctorsArraylist= doctorList.DoctorArrayList();

         for (int i=0;i<doctorList.DoctorArrayList().size();i++)



            System.out.println("DoctorName: :"+DoctorsArraylist.get(i).getName()+":"  +"place:"+DoctorsArraylist.get(i).getPlace()+":"   + "age:"+DoctorsArraylist.get(i).getAge()+":"  +"patent:"+DoctorsArraylist.get(i).getPatient()
              + ":"     +"Disease;"+DoctorsArraylist.get(i).getDisease());


        }

    }
