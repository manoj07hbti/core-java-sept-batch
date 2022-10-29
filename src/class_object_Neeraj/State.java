package class_object_Neeraj;

public class State {

    String state_name="UTTAR PRADESH";

    String capital="Lucknow";

    int population=265436787;

    int district=75;

    public static void main(String[] args) {

        State obj=new State();

        System.out.println("state_name--"+obj.state_name);

        System.out.println("capital of uttar pradesh--"+obj.capital);

        System.out.println("total population--"+obj.population);

        System.out.println("total district--"+obj.district);
    }
}
