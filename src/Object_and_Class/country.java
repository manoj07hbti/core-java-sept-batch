package Object_and_Class;

public class country {

    String country;
    String state;
    int number;
    String name;

    public country(String country, String state, int number, String name) {
        this.country = country;
        this.state = state;
        this.number = number;
        this.name = name;
    }

    public static void main(String args[]){

        country collect= new country("India", "Uttar pradesh",  27, "Aniket");

        System.out.println("country:"+collect.country+ "state:"+collect.state + "number:"+collect.number +"name:"+collect.name);

    }

}
