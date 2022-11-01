package assignment;

public class Country {
    String countryName;
    String countryCapital;
    int countryCode;

    public Country(String countryName, String countryCapital, int countryCode) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        this.countryCode = countryCode;
    }

    public static void main(String[] args) {
        Country cont = new Country("India","NewDelhi",+91);
        System.out.println("Country Name:- " + cont.countryName+ " Capital:- " + cont.countryCapital+ " Code:- " + cont.countryCode);

        Country cont2 = new Country("Pakistan","Islamabad",92);
        System.out.println("Country Name:- " + cont2.countryName+ " Capital:- " + cont2.countryCapital+ " Code:- " + cont2.countryCode);
    }
}
