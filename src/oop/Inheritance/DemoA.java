package oop.Inheritance;

public class DemoA {

   public void m1(){
       System.out.println("this is normal method of Demo A");

   }
   public void m2(){
       System.out.println("this is method of m2");


   }
   protected void m4(){
       System.out.println("this is final");

   }

   public static void main(String[]args){
       DemoA Demo1=new DemoA();
       Demo1.m1();
       Demo1.m2();
       Demo1.m4();

   }
   

}
