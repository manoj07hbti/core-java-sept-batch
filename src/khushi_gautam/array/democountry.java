package khushi_gautam.array;

public class democountry {
    String country;
    long population;
    String language;
    // parametrized constructor

    public democountry(String country, long population, String language) {
        this.country = country;
        this.population = population;
        this.language = language;
    }

    public static void main(String[] args) {
        democountry country = new democountry("India",1662930406618l,"Hindi");
        democountry country1 = new democountry("America",335512197l,"Amercian English");
        democountry country2 = new democountry("china",145223536378654l,"Mandarin");

        System.out.println(country.country +" , "+ country.population +" , "+ country.language);
        System.out.println(country1.country +" , "+country1.population +" , "+ country1.language);
        System.out.println(country2.country +" , "+country2.population +" , "+ country2.language);
    }
}
