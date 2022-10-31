package assignment_class_and_object;

public class State {

    String name="Uttar Pradesh";
    int district=75;
    int Seats= 403;
    String CM= "Yogi AdityaNath";

    public static void main(String[] args) {
        State DTE = new State(); // obj object created
        System.out.println("State name : " + DTE.name);
        System.out.println("State Districts : " + DTE.district);
        System.out.println("State  Lok Sabha Seats : " + DTE.Seats);
        System.out.println("State CM  : " + DTE.CM);
    }
}
