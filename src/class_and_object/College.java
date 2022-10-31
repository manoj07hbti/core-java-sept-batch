package class_and_object;

public class College {
    String name;
    String city;
    String type;

    public College(String name, String city, String type) {
        this.name = name;
        this.city = city;
        this.type = type;
    }

    public static void main(String[] args) {
        College coll1= new College("IIT","Kanpur","Engg college");
        College coll2= new College("IIM","Ahmedabad","Management college");
        College coll3= new College("BHU", "Varanasi","Arts College");

        System.out.println("---College 1 details---");
        System.out.println("Name: " + coll1.name+"\n"+"City: "+coll1.city+"\n"+"Type: "+coll1.type);
        System.out.println("---College 2 details---");
        System.out.println("Name: " + coll2.name+"\n"+"City: "+coll2.city+"\n"+"Type: "+coll2.type);
        System.out.println("---College 3 details---");
        System.out.println("Name: " + coll3.name+"\n"+"City: "+coll3.city+"\n"+"Type: "+coll3.type);
    }
}
