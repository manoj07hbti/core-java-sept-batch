package class_object;

public class State {

    String name="UTTAR PRADESH";
    String capital="LUCKNOW";
    int district=75;
    int population=228959599;

    public static void main(String[] args) {

        State obj=new State();

        System.out.println("Showing State Name.." +obj.name);
        System.out.println("Showing State Capital Name.." +obj.capital);
        System.out.println("Showing State District Name.." +obj.district);
        System.out.println("Showing State Number Of Population.." +obj.population);


    }
}
