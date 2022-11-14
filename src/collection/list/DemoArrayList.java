package collection.list;

import java.util.ArrayList;

public class DemoArrayList {

    public ArrayList<String> StringList(){

        ArrayList <String> course= new ArrayList<>();
        course.add("RealMe");
        course.add("Xiaomi");
        course.add("Iphone");
        course.add("OnePlus");
        course.add("Samsung");
        course.add("Blackberry");

        return course;
    }

    // int ArrayList       ArrayList <Integer>

    public ArrayList<Integer> IntList(){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(44);
        list.add(66);
        list.add(77);
        list.add(88);
        list.add(99);

        return list;

    }
    // decimal arrayList   ArrayList <Double>

    public ArrayList<Double> Doublelist(){

        ArrayList<Double> data = new ArrayList<>();
        data.add(11.11);
        data.add(22.22);
        data.add(33.33);
        data.add(44.44);
        data.add(55.55);
        data.add(66.66);
        data.add(77.77);
        return  data;



    }

    public static void main(String[] args) {

        DemoArrayList obj= new DemoArrayList();

        ArrayList <String> course=obj.StringList();

        for(String ver: course){

            System.out.println("Printing ArrayList in loop "+ver);
        }

        ArrayList <Integer> list = obj.IntList();

        for(Integer var : list){

            System.out.println("Printing  Integer ArrayList in Loop: " +var);
        }

        ArrayList <Double> data = obj.Doublelist();

        for( Double var : data){

            System.out.println("Printing Double Arraylist in Loop: "+var);
        }

    }


}
