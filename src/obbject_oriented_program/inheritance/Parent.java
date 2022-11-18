package obbject_oriented_program.inheritance;

public class Parent {
    public void A1(){
        System.out.println("This is parent class A1");

    }
    public void A2(){
        System.out.println("This is parent class of A2");

    }
    public void A3(){
        System.out.println("This is Parent Class of A3");
    }

    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.A1();
        obj.A2();
        obj.A3();
    }

}
