package collection.list_demo;

import java.util.ArrayList;

public class DemoArrayList {

    public ArrayList<String> createStringList() {

        ArrayList<String> name = new ArrayList<>();
        name.add("Lucky");
        name.add("Vicky");
        name.add("Ashu");
        name.add("Rahul");

        return name;
    }

    public ArrayList<Integer> createIntList() {

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        return number;
    }

    public ArrayList<Double> createDoubleList(){
        ArrayList<Double> decimal=new ArrayList<>();
        decimal.add(25.4);
        decimal.add(14.4);
        decimal.add(1225.2);
        decimal.add(11.52);

        return decimal;
    }

    public static void main(String[] args) {
        DemoArrayList obj=new DemoArrayList();

        ArrayList<String> Name=obj.createStringList();
        for (int i=0; i<Name.size(); i++){
            System.out.println("Print String with for loop: "+Name.get(i));
        }
        ArrayList<Integer> Number=obj.createIntList();
        for (int j=0; j<Number.size(); j++){
            System.out.println("Print integer with for loop: "+Number.get(j));
        }
        ArrayList<Double> Decimal=obj.createDoubleList();
        for (int k=0; k<Number.size(); k++){
            System.out.println("Print double with for loop: "+ Decimal.get(k));
        }
    }

}
