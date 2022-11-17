package collection.hashSet;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {       //CLASS
    public HashSet<Student> studentHashSet(){                  //METHOD
        HashSet<Student> list=new HashSet<>();
        System.out.println("HASHCODES: ");//COLLECTION
        Student std1=new Student(1,"RAM","ME",45,2204687);
        System.out.println(std1.hashCode());
        Student std2=new Student(3,"LAKHAN","EE",451,2200687);
        System.out.println(std2.hashCode());
        Student std3=new Student(2,"AKASH","EC",452,2200087);
        System.out.println(std3.hashCode());
        Student std5=new Student(3,"LAKHAN","EE",451,2200687);
        System.out.println(std5.hashCode());
        Student std4=new Student(4,"SHIVAM","IT",455,2200007);
        System.out.println(std4.hashCode());
        Student std6=new Student(4,"SHIVAM","IT",455,2200007);
        System.out.println(std6.hashCode());

        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);
        list.add(std5);
        list.add(std6);
        return list;
    }

    public static void main(String[] args) {
        StudentHashSet obj=new StudentHashSet();
        HashSet<Student> list=obj.studentHashSet();
        System.out.println(list.size());

        for(Student var:list){
            System.out.println("roll no:"+var.getRollNo()+" name:"+var.getName()+" Section:"+var.getSection()+" RAnk:"+var.getRank()+" Phn No.:"+var.getPhnNo());
        }

    }
}
//TODO HASHCODES ARE SAME FOR EQUAL ENTITIES (NAME,ROLL NO.,SECTION,PHN NO.,RANK) SO THE SAME OBJECT NOT SHOW IN CONSOLE



//////According to name