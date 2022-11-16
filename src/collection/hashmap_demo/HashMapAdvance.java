package collection.hashmap_demo;

import model.Engineer;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAdvance {

    public HashMap<String, ArrayList<Engineer>> engineerInfo() {

        HashMap<String, ArrayList<Engineer>> engineer = new HashMap<>();

        ArrayList<Engineer> glaList = new ArrayList<>();
        ArrayList<Engineer> agcList = new ArrayList<>();

        Engineer enginer1 = new Engineer("Lucky", "IT", 01);

        Engineer enginer2 = new Engineer("Vicky", "CS", 02);

        Engineer enginer3 = new Engineer("Ashu", "Civil", 03);

        glaList.add(enginer1);
        glaList.add(enginer2);
        glaList.add(enginer3);

        enginer1 = new Engineer("Lucky", "IT", 01);

        enginer2 = new Engineer("Vicky", "CS", 02);

        enginer3 = new Engineer("Ashu", "Civil", 03);

        agcList.add(enginer1);
        agcList.add(enginer2);
        agcList.add(enginer3);

        engineer.put("GLA", glaList);
        engineer.put("AGC", agcList);

        return engineer;
    }

    public static void main(String[] args) {
        HashMapAdvance obj=new HashMapAdvance();

        HashMap<String, ArrayList<Engineer>> engineer=obj.engineerInfo();

        for (String var:engineer.keySet()){

            if (var=="GLA"){

                ArrayList<Engineer> engineerArrayList=engineer.get(var);

                for (Engineer eng:engineerArrayList){
                    System.out.println("GLA engineer: "+ eng.getBatch()+": "+ eng.getName()+": "+eng.getBranch());
                }
            }
        }
        System.out.println(engineer);
    }
}
