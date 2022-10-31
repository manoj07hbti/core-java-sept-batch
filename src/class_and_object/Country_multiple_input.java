package class_and_object;


public class Country_multiple_input {
    String name;
    String capital;
    String currency;

    public Country_multiple_input(String name, String capital, String currency) {
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }
    public static void main(String[] args) {
        Country_multiple_input Country1 = new Country_multiple_input("India","New Delhi","Rupee");
        Country_multiple_input Country2 = new Country_multiple_input("America","Washington DC","Dollar");
        Country_multiple_input Country3 = new Country_multiple_input("Japan","Tokyo", "yen");
        System.out.println("---Country 1 details---");
        System.out.println("Name: " + Country1.name+"\n"+"Capital: "+Country1.capital+"\n"+"Currency: "+Country1.currency);
        System.out.println("---Country 2 details---");
        System.out.println("Name: " + Country2.name+"\n"+"Capital: "+Country2.capital+"\n"+"Currency: "+Country2.currency);
        System.out.println("---Country 3 details---");
        System.out.println("Name: " + Country3.name+"\n"+"Capital: "+Country3.capital+"\n"+"Currency: "+Country3.currency);
    }
}
