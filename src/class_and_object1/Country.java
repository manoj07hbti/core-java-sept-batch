package class_and_object1;

import com.sun.xml.internal.ws.resources.BindingApiMessages;

public class Country {
    String name="India";
    int states=29;
    String flag="flag of india";

    public Country(String name, int states, String flag) {
        this.name = name;
        this.states = states;
        this.flag = flag;
    }

    public static void main(String[] args) {
        Country india= new Country("India",29,"flag of india");
        System.out.println("Name: "+india.name+" state: "+india.states+" flag: "+india.flag);

    }
}
