package class_and_object;

public class Dog {
    int ears = 2;
    String colour = "brown";
    String breed = "Pit-bull";
    int legs = 4;
    String qualities = "Strong and has sharp teeth";

    public static void main(String[] args) {
        Dog robert = new Dog();
        System.out.println("number of ears: "+robert.ears+"\n"+
                            "number of legs: "+robert.legs+"\n"+
                            "breed: "+robert.breed+"\n"+
                            "colour: "+robert.colour+"\n"+
                            "qualities: " + robert.qualities);
    }

}
