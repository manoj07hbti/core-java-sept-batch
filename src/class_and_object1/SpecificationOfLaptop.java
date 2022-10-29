package class_and_object1;

import javax.swing.text.html.HTMLDocument;

public class SpecificationOfLaptop {
    String name="Dell";
    float price=41060.36f;
    int ram=500;
    String colour="SkyBlue";

    public static void main(String[] args) {
        //TODO SYNTAX clasName objName=new classname
        SpecificationOfLaptop lappy=new SpecificationOfLaptop();
        System.out.println("Specification Of MyLaptop::");
        System.out.println("Company:" +lappy.name+"\n"+"Price:" +lappy.price+ "\n" + "Ram:"+lappy.ram);
        System.out.println("Colour:" +lappy.colour);
    }
}
