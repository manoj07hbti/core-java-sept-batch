package oops.abstraction.inheritance;



public class DemoA {

    public void m1(){

        System.out.println("This is M1 method of DemoA ");
    }

    public void m2(){

        System.out.println("This is M2 method of DemoA ");
    }

    protected void m4(){

        System.out.println("This is M4 method of DemoA ");
    }

    public static void main(String[] args) {


        DemoA obj= new DemoA();
        obj.m1();
        obj.m2();
    }
}
