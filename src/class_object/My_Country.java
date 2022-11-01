package class_object;

public class My_Country {

    String name;
    String capital;
    int country_code;
    int states;

    public My_Country(String name, String capital, int country_code, int states) {
        this.name = name;
        this.capital = capital;
        this.country_code = country_code;
        this.states = states;
    }

    public static void main(String[] args) {

        My_Country country=new My_Country("INDIA","NEW DELHI",+91,29);
        System.out.println(" Country Name : " +country.name+ " Capital Name : " +country.capital+ " Contry Code : " +country.country_code+ " States  : " +country.states);
    }
}
