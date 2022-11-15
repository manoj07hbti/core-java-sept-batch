package collection;
import java.util.HashMap;
import java.util.Set;

public class Doctor_HashMap {

    public HashMap<Double,Double> create(){
        HashMap<Double,Double>  all= new HashMap<>();

        all.put(11.25,11.12);
        all.put(10.11,12.11);
        all.put(100.1,2500.12);

        return all;
    }

    public static void main(String[] args) {
        Doctor_HashMap obj=new Doctor_HashMap();
        HashMap<Double,Double> all=obj.create();

        Set<Double> keys=all.keySet();

        for (double var : keys){
            System.out.println(all.get(var));
        }




    }
}


