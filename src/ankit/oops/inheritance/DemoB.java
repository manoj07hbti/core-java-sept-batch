package ankit.oops.inheritance;

public class DemoB extends DemoA {

    public void m3(){
        System.out.println("This is M3 method of Demo B");
    }

    //overriding

    public void m1(){
        System.out.println("I M A Child Class Method");
    }
    public static void main(String[] args) {
        DemoB obj =new DemoB();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
