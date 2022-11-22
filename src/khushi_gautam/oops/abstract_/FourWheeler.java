package khushi_gautam.oops.abstract_;

public class FourWheeler extends Vehicle {

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
        double JeepGrandCherokee = 77.50;
        double PMVEaSE = 4.79;
        double BYDAtto3=33.99;
        System.out.println("Four wheeler prices");
        System.out.println("--------------------");
        System.out.println("JeepGrandCherokee: "+JeepGrandCherokee );
        System.out.println("PMV EaS E"+PMVEaSE);
        System.out.println("BYDAtto3: "+BYDAtto3);
    }

    public static void main(String[] args) {
        FourWheeler obj= new FourWheeler();
        obj.welome();
        obj.display();
        obj.servicing();
        obj.price();
    }
}
