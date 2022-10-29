package class_object1;

public class Country {


    // Todo : properties

    String name      = "India";
    int district     = 27;
    String stateName = "UttarPradesh";

    public static void main(String[] args) {

        // Todo : Create a object by the constructor method

        //Todo Syntax : ClassName objectName = new ClassName();

                        Country country = new Country();

        System.out.println("Printing the Country  name : " + country.name);
        System.out.println("Printing the Total district : " + country.district);
        System.out.println("Printing the StateName : " + country.stateName);

        System.out.println("Printing the  details : " + country.name +":" +country.district +":"+ country.stateName );

    }

}
