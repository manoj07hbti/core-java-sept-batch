package class_and_obj;

import class_and_object.Laptop;

public class City {

    String city = "AGRA";
    int no_of_person = 100000;
    String place_in_agra = "TAJMAHAL, GURUDWARA, FATEHPURSEEKARI";
    String state = "UP";


    public static void main(String[] args) {
        //TODO SYNTAX :  ClassName objName= new ClassName();

        City obj = new City();

        System.out.println(" city :" + obj.city + "    &  no_of_person   : " + obj.no_of_person + "    &     place_in_agra   :   " +obj.place_in_agra+ "  &  state    :"   +obj.state);

    }
}
