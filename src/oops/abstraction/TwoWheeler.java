package oops.abstraction;

public class TwoWheeler extends Vehicle {
    @Override
    public void servicing() {

        System.out.println("********This is two wheeler servicing**********");
    }

    @Override
    public void pricing() {
        System.out.println("********This is two wheeler pricing **********");
    }


    public static void main(String[] args) {
        TwoWheeler obj= new TwoWheeler();

        obj.welcome();
        obj.servicing();
        obj.pricing();

    }
}
