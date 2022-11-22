package oops.polymorphism;

public class MethodOverriding extends Parent {

    public void m1(){

        System.out.println("This is M1 method of CHILD class ....");
    }

    public static void main(String[] args) {

        Parent obj= new Parent();
        obj.m1();// it will call parent class method because object is of Parent class

        Parent obj1= new MethodOverriding();
        obj1.m1();//it will call child class method as object is created of Child class

       /* MethodOverLoading obj2= new Parent(); // compile time error as Child can not store object of parent class
        obj2.m1();*/


    }
}
