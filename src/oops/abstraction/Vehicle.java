package oops.abstraction;

public abstract class Vehicle {

    public void welcome(){

        System.out.println("******Welcome to Vehicle information System********");
    }

    public void displayInfo(){

        System.out.println("****** Vehicle information is :********");
    }

    public abstract void servicing();
    public abstract void pricing();

}
