package class_and_object1;

public class Motorcycle {
    String company="Pulsar";
    int cc=150;
    int price=95000;
    String colour="Red Wine ";
    int model=2018;
    String type="First Hand";

    public static void main(String[] args) {
        //TODO SYNTAX className objName=new className();
        Motorcycle obj=new Motorcycle();
        System.out.println("MY BIKE");
        System.out.println("Company:"+obj.company+"\n"+"colour: "+obj.colour);
        System.out.println("Engine:"+obj.cc+"\n"+"Price:"+obj.price+"\n"+"Model of Year:"+obj.model);
        System.out.println("Type:"+obj.type);
    }
}
