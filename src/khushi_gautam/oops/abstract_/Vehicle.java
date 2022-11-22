package khushi_gautam.oops.abstract_;

public abstract class Vehicle {
    public void welome(){
        System.out.println("welcome to the vehicle information");
        System.out.println("  ");
    }
    public void display(){
        String name= "pulsar 125";
        double engine= 124.4 ;
        double power =11.8;
        double mileage= 51.46;
        String tyreType= "tubelss";
        System.out.println("Display information: ");
        System.out.println("Name: "+name);
        System.out.println("Engine: "+engine+"ccc");
        System.out.println("Power: "+power+" PS");
        System.out.println("Mileage: "+mileage+" kmpl");
        System.out.println("Tyre Type: "+ tyreType);
        System.out.println("  ");
    }
    public abstract void servicing();
    public abstract void price();
}
