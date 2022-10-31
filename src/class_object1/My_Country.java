package class_object1;

public class My_Country {
    String countryName;
    String cityName;
    String district;
    int flatNumber;
    int pinCode;

    // Todo : Parameter Constructor
    public My_Country(String countryName, String cityName, String district, int flatNumber, int pinCode) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.district = district;
        this.flatNumber = flatNumber;
        this.pinCode = pinCode;
    }
    // main method
    public static void main(String[] args) {

        // Todo : crete object by the constructor

        // Todo : Syntax
        //  ClassName objectName = new ClassName(Parameter1,Parameter2,Parameter3,...);

 My_Country country = new My_Country("India","Firozabad","Firozabad",213,283145);
        System.out.println("My Country name is : " + country.countryName);
        System.out.println("My City name is : " + country.cityName);
        System.out.println("My District name is : " + country.district);
        System.out.println("FlatNumber is : " + country.flatNumber );
        System.out.println("PinCode is : " + country.pinCode);


    }
}
