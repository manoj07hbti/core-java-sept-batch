package my_class_and_object;

public class Car {

    private String color;
    public String getColor()
    {
        return color;
    }
    public void setColor(String c)
    {
        color=c;
    }
    private String model;
    public String getModel()
    {
        return model;
    }
    public void setModel(String m)
    {
        model=m;
    }

    public static void main(String[] args) {
        Car tesla= new Car();
        tesla.setColor("Blue");
        tesla.setModel("Model- Tesla s");
        System.out.println("Color of Car is :"+tesla.getColor());
        System.out.println("Model of Car is :"+tesla.getModel());

    }
}
