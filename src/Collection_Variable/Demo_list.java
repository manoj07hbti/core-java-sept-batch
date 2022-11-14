package Collection_Variable;

import java.util.ArrayList;

public class Demo_list {

    //TODO SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();

    public ArrayList<String> touristPlace(){

        ArrayList <String> cities= new ArrayList<>();
          cities.add("Manali");
          cities.add("Rajasthan");
          cities.add("Uttarakhand");
          cities.add("Amritsar");
          cities.add("Delhi");

          return cities;

    }
    public static void main (String args[]){
          Demo_list obj = new Demo_list();
        ArrayList <String> cities = obj.touristPlace();

        for(int i=0; i<cities.size(); i++){

            System.out.println("Normal for Loop "+cities.get(i));
        }

    }


}
