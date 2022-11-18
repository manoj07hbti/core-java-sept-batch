package obbject_oriented_program.inheritance;

public class Child extends Parent {
    @Override
    public void A1() {
        System.out.println("I can Change the properties of Parent");

    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.A1();
        obj.A2();
        obj.A3();
    }
}

