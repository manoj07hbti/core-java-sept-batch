package oops.inheritance;

public class DemoB extends DemoA{

   public void m3(){

       System.out.println("This is M3 method of DemoB");
   }

   //Overriding

    public void m1(){

       System.out.println("I am Child class method...");
    }

    public static void main(String[] args) {

        DemoB obj= new DemoB();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();

    }
}
