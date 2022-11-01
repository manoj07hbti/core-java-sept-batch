package class_and_object1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    String name;
    long Aadhar;
    long mobile;
    String programme;

    public Person(String name, long aadhar, long mobile, String programme) {
        this.name = name;
        Aadhar = aadhar;
        this.mobile = mobile;
        this.programme = programme;
    }

    public static void main(String[] args) {


        Person obj = new Person("Vishal Baboo", 289047851256l, 8745755485l, "Student");
        System.out.println("Person Name:" + obj.name + " Adhar No.:" + obj.Aadhar + " mobile No.:" + obj.mobile + " Programme:" + obj.programme);
        Person obj1 = new Person("Nikhil Verma", 321457895642l, 87457554456l, "Student");
        System.out.println("Person Name:" + obj1.name + " Adhar No.:" + obj1.Aadhar + " mobile No.:" + obj1.mobile + " Programme:" + obj1.programme);
        Person obj2 = new Person("Vipin Maurya", 458747851256l, 98645755485l, "Student");
        System.out.println("Person Name:" + obj2.name + " Adhar No.:" + obj2.Aadhar + " mobile No.:" + obj2.mobile + " Programme:" + obj2.programme);
        Person obj3 = new Person("Akash Kumar", 457847851256l, 9635755485l, "Student");
        System.out.println("Person Name:" + obj3.name + " Adhar No.:" + obj3.Aadhar + " mobile No.:" + obj3.mobile + " Programme:" + obj3.programme);

    }

}
