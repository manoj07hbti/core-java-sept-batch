package khushi_gautam.collection.list;

import java.util.ArrayList;
//todo it will create Arraylist of double datatype
public class DemoArrayList {
    public ArrayList<Double> DoubleList(){
        ArrayList<Double> num = new ArrayList<>();
        num.add(4.66);
        num.add(2.36);
        num.add(4.64);
        num.add(6.73);
        return num;
    }

    public static void main(String[] args) {
        DemoArrayList obj=new DemoArrayList();
        ArrayList<Double> num =obj.DoubleList();
        for (double n: num){
            System.out.println(n);
        }
    }
}
