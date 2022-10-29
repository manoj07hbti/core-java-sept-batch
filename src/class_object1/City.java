package class_object1;

public class City {

    // Todo : properties

    String cityName = "Pune";
    int flatNumber  = 403;
    String colonyName = "Vasant";


    // Todo : capabilities
    // live
    // walk
    // work


    public static void main(String[] args) {

        // Todo : Create a object by the constructor method

        //Todo Syntax : ClassName objectName = new ClassName();
                        City obj = new City();
        System.out.println("My city name is : " + obj.cityName);
        System.out.println("My flatNumber is : " +  obj.flatNumber);
        System.out.println("Printing the colonyName : " + obj.colonyName);

        System.out.println("Printing the City details : " + obj.cityName +":" +obj.flatNumber +":"+ obj.colonyName );

    }
}
