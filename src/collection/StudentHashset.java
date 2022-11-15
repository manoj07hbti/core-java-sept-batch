package collection;

import model.Student;

import java.util.HashSet;

public class StudentHashset {

    public HashSet<Student> doggie(){
        HashSet<Student> mummy=new HashSet<>();

        Student s1=new Student("aaa","bbbb",11);
        System.out.println(s1.hashCode());
        Student s2 =new Student("cccc","dddd",222);
        System.out.println(s2.hashCode());
        Student s3=new Student("aaa","bbbb",11);
        System.out.println(s3.hashCode());
        Student s4 =new Student("cccc","dddd",222);
        System.out.println(s4.hashCode());
        Student s5=new Student("aaa","bbbb",11);
        System.out.println(s5.hashCode());
        Student s6 =new Student("cccc","dddd",222);
        System.out.println(s6.hashCode());

        System.out.println(" ");

        mummy.add(s1);
        mummy.add(s2);
        mummy.add(s3);
        mummy.add(s4);
        mummy.add(s5);
        mummy.add(s6);

        return mummy;


    }

    public static void main(String[] args) {
        StudentHashset obj=new StudentHashset();
        HashSet<Student> doggie=obj.doggie();

        for (Student var :doggie){
            System.out.println(var.getName()+ var.getDepartmen()+var.getRollno() );
        }



    }










}
