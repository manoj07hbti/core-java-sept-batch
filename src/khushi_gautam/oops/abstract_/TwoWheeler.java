package khushi_gautam.oops.abstract_;

public  class TwoWheeler extends Vehicle {

    @Override
    public void servicing() {
        System.out.println("Servicing");
        System.out.println("----------");
        System.out.println("check engine oil");
        System.out.println("Inspect the engine");
        System.out.println("check the brakes");
        System.out.println("  ");
    }

    @Override
    public void price() {
        long HeroSplendorPlusPrice= 75446;
        long  BajajPulsar125  = 90003;
        System.out.println("Two wheeler price");
        System.out.println("------------------");
        System.out.println("Hero Splendor Plus: "+ HeroSplendorPlusPrice);
        System.out.println("Bajaj Pulsar 125: "+BajajPulsar125);
        System.out.println("  ");
    }

    public static void main(String[] args) {
        TwoWheeler obj= new TwoWheeler();
        obj.welome();
        obj.display();
        obj.servicing();
        obj.price();
    }
}
