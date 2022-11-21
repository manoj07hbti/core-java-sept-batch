package oops.abstraction;

public class FourWheeler extends Vehicle {
    @Override
    public void servicing() {

        System.out.println("********This is Four wheeler servicing**********");
    }

    @Override
    public void pricing() {
        System.out.println("********This is Four wheeler Pricing **********");
    }

    public static void main(String[] args) {


        FourWheeler obj= new FourWheeler();
        obj.welcome();
        obj.servicing();
    }
}
