package obbject_oriented_program.inheritance;

public class DemoA {
    public void m1(){
        System.out.println("This is M1 Methopd of DemoA");

    }
    public void m2(){
        System.out.println("This is m2 method of DemoA");

    }
    public void m4(){
        System.out.println("This is m3 method of DemoA");
    }

    public static void main(String[] args) {
        DemoA obj=new DemoA();
        obj.m1();
        obj.m2();
        obj.m4();
    }
}
