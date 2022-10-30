package class_and_object;

public class Country {
    String realName = "Bharat";
    int states = 28;
    String primeMinister = "Narendra Modi";
    String president ="Draupadi murmu";

    public static void main(String[] args) {
        Country India = new Country();
        System.out.println("Real name of india is: "+India.realName+"\n"+
                "President of India is: Shrimati "+India.president+"\n"+
                "Prime minister of India is: Shri "+India.primeMinister+"\n"+
                "Number of states in India is "+India.states);
    }

}
