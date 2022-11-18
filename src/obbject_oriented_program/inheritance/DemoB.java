package obbject_oriented_program.inheritance;

public class DemoB extends DemoA {
    public void m1(){
        System.out.println("I override M1 from demo A class");  ///Overriding
    }
    public static void main(String[] args) {
DemoB obj=new DemoB();
obj.m1();
obj.m2();
obj.m4();
    }
}
