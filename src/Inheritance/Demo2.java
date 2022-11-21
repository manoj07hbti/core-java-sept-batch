package Inheritance;

public class Demo2  extends Demo1{

  public void m3(){
      System.out.println("India is a beautiful country");
    }
    public void m4(){
        System.out.println("Agra is famous for Taj Mahal");

    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();

    }


}

