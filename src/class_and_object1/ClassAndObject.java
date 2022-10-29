package class_and_object1;

public class ClassAndObject {
    String mobile="Samsung";
    int ram=12;
    String memory="128 GB";
    String colour="Blue";
    int price=26499;

    public static void main(String[] args) {
        //TODO SYNTAX className objName=new className
        ClassAndObject obj=new ClassAndObject();
        System.out.println("I have mobile of "+obj.mobile+" having ram "+obj.ram+" of colour "+obj.colour+"....");
        System.out.println("Price is "+obj.price);
        System.out.println("Internal Memory:"+obj.memory);

    }

}
