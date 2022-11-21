package oop.Inheritance;

public class DemoB extends DemoA{
public void m3(){
    System.out.println("this is m3 method of DemoB");
}

    public static void main(String[]args){
        DemoB DemoB=new DemoB();
        DemoB.m1();
        DemoB.m2();
        DemoB.m3();

    }




}
