package collection.list_demo;

import model.Engineer;

import java.util.ArrayList;

public class EngineerArrayList {

    public ArrayList<Engineer> createEngineerList() {
        //TODO SYNTAX :  CollectionName <DATATYPE> objName= new CollectionName<>();
        ArrayList<Engineer> engineerArrayList = new ArrayList<>();

        Engineer engineer1 = new Engineer("Rahul", "IT", 01);
        Engineer engineer2 = new Engineer("Ashu", "electrical", 02);
        Engineer engineer3 = new Engineer("Lucky", "civil", 03);
        Engineer engineer4 = new Engineer("Vicky", "mechanical", 04);

        engineerArrayList.add(engineer1);
        engineerArrayList.add(engineer2);
        engineerArrayList.add(engineer3);
        engineerArrayList.add(engineer4);

        return engineerArrayList;
    }

    public static void main(String[] args) {
        EngineerArrayList obj=new EngineerArrayList();
        ArrayList<Engineer> engi=obj.createEngineerList();
        for (int i=0; i<engi.size(); i++){
            System.out.println("Print name: "+engi.get(i).getName()+" Branch: "+engi.get(i).getBranch()+" Batch: "+engi.get(i).getBatch());
        }
    }
}
