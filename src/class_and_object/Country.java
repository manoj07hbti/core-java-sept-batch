package class_and_object;

public class Country {

    String countryName="INDIA";
    int states=29;
    String population="125 corror";

    public static void main(String[] args) {
        Country obj=new Country();
        System.out.println("Country name is:"+obj.countryName);
        System.out.println("State count is:"+obj.states);
        System.out.println("Country population is:"+obj.population);
    }
}
