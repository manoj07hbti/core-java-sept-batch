package collection.list;

import java.util.ArrayList;

public class Demo_ArrayList {

    //String
    public ArrayList<String> StringList() {

        ArrayList<String> course = new ArrayList<String>();
        course.add("JAVA");
        course.add("C");
        course.add("C++");
        course.add("C#");
        course.add("AI");

        return course;
    }

    //Integer
    public ArrayList<Integer> IntegerList() {

        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(76);
        marks.add(98);
        marks.add(23);
        marks.add(34);
        marks.add(98);
        marks.add(100);

        return marks;

    }

    //Double
    public ArrayList<Double> DoubleList() {

        ArrayList<Double> temperature = new ArrayList<Double>();

        temperature.add(45.56);
        temperature.add(22.06);
        temperature.add(45.28);
        temperature.add(22.16);
        temperature.add(49.00);

        return temperature;

    }

    //Character
    public ArrayList<Character> CharacterList() {

        ArrayList<Character> Alphabets = new ArrayList<Character>();
        Alphabets.add('A');
        Alphabets.add('E');
        Alphabets.add('I');
        Alphabets.add('O');
        Alphabets.add('U');

        return Alphabets;

    }


    public static void main(String[] args) {

        Demo_ArrayList obj = new Demo_ArrayList();
        ArrayList<String> course = obj.StringList();

        //Advance for loop

        for (String var : course) {

            System.out.println("ArrayList in Loop :   " + var);
        }
        ArrayList<Integer> marks = obj.IntegerList();

        for (Integer var : marks) {

            System.out.println("IntegerList in Loop  :   " + var);
        }

        ArrayList<Double> temperature = obj.DoubleList();

        for (Double var : temperature) {

            System.out.println("DoubleList in Loop  :  " + var);
        }

        ArrayList<Character> Alphabets = obj.CharacterList();

        for (Character var : Alphabets) {

            System.out.println("CharacterList in Loop  :  " + var);

        }

    }
}
