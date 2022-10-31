package assignment_class_and_object;

public class Country {

    String name="USA";
    int states=50;
    String  capital= "Washington DC";
    String president= "Joe Biden";

    public static void main(String[] args) {
        Country obj= new Country(); // obj object created
        System.out.println("Country name : "+obj.name);
        System.out.println("Total States : "+obj.states);
        System.out.println("Capital USA : "+obj.capital);
        System.out.println("President of USA : "+obj.president);
    }


}
