package collection;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public ArrayList<Student> Success(){


        ArrayList<Student> papa = new ArrayList<>();

        Student st1 = new Student("aa", "bb", 11);
        Student st2 = new Student("ccc", "ddd", 222);

        papa.add(st1);
        papa.add(st2);


        return papa;





    }



    public static void main(String[] args) {
         StudentArrayList obj=new StudentArrayList();
         ArrayList<Student> Success=obj.Success();

         for (int i=0; i<Success.size(); i++){
             System.out.println(Success.get(i).getName());
         }
    }

    }




