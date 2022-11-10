package collection.hashset_demo;

import model.Engineer;

import java.util.HashSet;

public class EngineerHashset {
    public HashSet<Engineer> engHashset(){
        HashSet<Engineer> engineer=new HashSet<>();

        Engineer enginer1=new Engineer("Lucky", "IT", 02);
        Engineer enginer2=new Engineer("Vicky", "CS", 03);
        Engineer enginer3=new Engineer("Lucky", "IT", 02);

        engineer.add(enginer1);
        engineer.add(enginer2);
        engineer.add(enginer3);

        return engineer;
    }

    public static void main(String[] args) {
        EngineerHashset obj=new EngineerHashset();
        HashSet<Engineer> engineer=obj.engHashset();

        for (Engineer var:engineer){
            System.out.println("Name: "+var.getName()+" Branch: "+var.getBranch()+" Batch: "+var.getBatch());
        }
    }
}
