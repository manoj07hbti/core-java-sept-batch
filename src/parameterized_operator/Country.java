package parameterized_operator;

public class Country {


    String name;
    String capital;
    int states;

    public Country(String name, String capital, int states) {
        this.name = name;
        this.capital = capital;
        this.states = states;
    }

    public static void main(String[] args){

        Country con = new Country("India", "New Delhi", 28);
        System.out.println("Name: " +con.name+ " Capital: " +con.capital+ " States: "+con.states);
        Country con2 = new Country("UK", "London", 9);
        System.out.println("Name: " +con2.name+ " Capital: "+con2.capital+ " States: " +con2.states);
        Country con3 = new Country("Germany", "Berlin", 16);
        System.out.println("Name: " +con3.name+ " Capital: " +con3.capital+ " States: " +con3.states);
    }
}
