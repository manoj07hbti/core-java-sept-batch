package assignment;

public class College {
    String Name;
    String State;
    int Year;

    public College(String name, String state, int year) {
        Name = name;
        State = state;
        Year = year;
    }

    public static void main(String[] args) {
        College clg = new College("IIT Kanpur","Uttar Pradesh",1951);
        System.out.println("College name :- " +clg.Name+ " State :- " +clg.State+ " Year:- " + clg.Year);

        College clg2 = new College("IIT Delhi","Delhi",1948);
        System.out.println("College name :- " +clg2.Name+ " State :- " +clg2.State+ " Year:- " + clg2.Year);

    }
}
