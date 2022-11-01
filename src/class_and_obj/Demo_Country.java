package class_and_obj;

public class Demo_Country {

    String country;
    String capital;
    String currency;

    public Demo_Country(String country, String capital, String currency) {
        this.country = country;
        this.capital = capital;
        this.currency = currency;
    }

    public static void main(String[] args) {

        Demo_Country country = new Demo_Country("INDIA", "NEW DELHI", "RUPEE");

        System.out.println("country:  "+country.country+ "   capital:  "+country.capital+ "    currency: "+country.currency);

        Demo_Country country1 = new Demo_Country("CHINA", "BEIJING", "RENMINBI");

        System.out.println("country:  "+country1.country+ "   capital:  "+country1.capital+ "    currency: "+country1.currency);

        Demo_Country country2 = new Demo_Country("NEPAL", "KATHMANDU", "NEPALESE RUPEE");

        System.out.println("country:  "+country2.country+ "   capital:  "+country2.capital+ "    currency: "+country2.currency);
    }
}
