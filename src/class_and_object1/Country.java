package class_and_object1;

public class Country {
    String country="INDIA";
    int States=28;
    int UT=8;
    String state="Uttar Pradesh";
    int districts=75;
    String District="Firozabad";
    String city="Tundla";
    String code="UP83";

    public static void main(String[] args) {
        //TODO SYNTAX className objName=new className();
        Country obj=new Country();
        System.out.println("I love "+obj.country+" which have "+obj.States+" States and "+obj.UT+" Union Territories...");
        System.out.println("I Live in "+obj.state+" have district "+obj.districts+" and i m from... "+obj.District);
        System.out.print("a samll city "+obj.city+" of code "+obj.code);
        System.out.print(".");

    }

}
