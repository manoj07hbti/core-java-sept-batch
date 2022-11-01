package class_and_object;

public class CountryParameter {
    String name;
    String president;
    int number;

    // TODO parameterized constructor

    public CountryParameter(String name, String president, int number) {
        this.name = name;
        this.president = president;
        this.number = number;
    }

    public static void main(String[] args) {

        CountryParameter country = new CountryParameter("India", "Narendra Modi", 1);
        System.out.println("Name :" + country.name + " President: " + country.president + " Number: " + country.number);

        CountryParameter country2 = new CountryParameter("US", "Donald Trump", 2);
        System.out.println("Name :" + country2.name + " President: " + country2.president + " Number: " + country2.number);

    }
}
