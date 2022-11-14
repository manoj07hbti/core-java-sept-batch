package collection.hashset_demo;

import model.Engineer;

import java.util.LinkedHashSet;

public class DemoLinkedHashset {

    public LinkedHashSet<Engineer> linkedHashset(){

        LinkedHashSet<Engineer> engineer=new LinkedHashSet<>();

        Engineer enginer1=new Engineer("Lucky", "IT", 02);

        Engineer enginer2=new Engineer("Vicky", "CS", 03);

        Engineer enginer3=new Engineer("Ashu", "IT", 04);

        engineer.add(enginer1);
        engineer.add(enginer2);
        engineer.add(enginer3);

        return engineer;
    }

    public static void main(String[] args) {
        DemoLinkedHashset obj=new DemoLinkedHashset();

        LinkedHashSet<Engineer> engineer=obj.linkedHashset();

        for (Engineer var: engineer){
            System.out.println("Print LinkedHashset: "+var.getName()+" Branch Name: "+var.getBranch()+" Batch Name: "+var.getBatch());
        }
    }
}
