package khushi_gautam;

public class State {
    String statename = "Uttar Pradesh";
    int district = 75;
    String area = "243286 Square km";
    String capital = "Lucknow";
    String mystate = "Aligarh";
    String myarea = "3650 Square km";
    String language = "Hindi";

    public static void main(String[] args) {
        //todo classname objname = new classname();
        State obj= new State();
        // todo objname.propertyname
        System.out.println("State name :"+obj.statename);
        System.out.println("Total District :"+obj.district);
        System.out.println("Area :"+obj.area);
        System.out.println("Capital :"+obj.capital);
        System.out.println("My State :"+obj.mystate);
        System.out.println("My Area :"+ obj.myarea);
        System.out.println("My language :"+obj.language);
    }
}
