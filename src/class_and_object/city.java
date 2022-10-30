package class_and_object;

public class city {
    String cityName = "agra";
    String state = "uttar pradesh";
    int stdCode = 0562;

    public static void main(String[] args) {
        city city = new city();
        System.out.println("name of the city is " +city.cityName +", the state is "+city.state+", the std code is "+city.stdCode );
    }
}