package opps.inheritance;

public class DemoB extends DemoA {

    public void m3(){
        System.out.println("This is m3 method of DemoB");
    }

    public static void main(String[] args) {
        DemoB obj = new DemoB();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }

}
