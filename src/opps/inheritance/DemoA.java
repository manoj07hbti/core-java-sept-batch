package opps.inheritance;

public class DemoA {

    public void m1(){

        System.out.println("This is M1 method of demoA");
    }

    public void m2(){

        System.out.println("This is M2 method of demoA");
    }
    protected void m4(){
        System.out.println("This is M4 method of demoA");


    }

    public static void main(String[] args) {
        DemoA obj = new DemoA();
        obj.m1();
        obj.m2();
    }
}
