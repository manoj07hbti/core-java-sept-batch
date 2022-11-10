package collection.hashset_demo;

import java.util.HashSet;

public class DemoHashset {

    public HashSet<String> hashsetString(){
        HashSet<String> cities=new HashSet<>();
        cities.add("Agra");
        cities.add("Mathura");
        cities.add("Mathura");

        return cities;
    }
    public HashSet<Integer> hashsetInt(){
        HashSet<Integer> number=new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(2);

        return number;
    }
    public HashSet<Double> hashsetDouble(){
        HashSet<Double> percentage=new HashSet<>();
        percentage.add(25.2);
        percentage.add(85.59654);
        percentage.add(25.2);

        return percentage;
    }

    public static void main(String[] args) {
        DemoHashset obj=new DemoHashset();
        HashSet<String> cities=obj.hashsetString();
        for (String var:cities){
            System.out.println("String Hashset: "+var);
        }
        HashSet<Integer> number=obj.hashsetInt();
        for (Integer var: number){
            System.out.println("Integer Hashset: "+var);
        }
        HashSet<Double> percentage=obj.hashsetDouble();
        for (Double var:percentage){
            System.out.println("Double Hashset: "+var);
        }
    }
}
