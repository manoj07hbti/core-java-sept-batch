package oops.abstraction;

public class Child extends DemoAbstract {
    @Override
    public void m1() {

        System.out.println("Implemented ");
    }


    public static void main(String[] args) {

        Child obj= new Child();
        obj.m1();
    }
}
