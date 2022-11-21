package ankit.oops.abstraction;

public abstract class DemoAbstract {
    public abstract void m1();  //Abstract Method

    public void m2(){                   // Normal Method 33% abstraction achieved
        System.out.println("This is normal method");
    }

    public void m3(){                   // Normal Method
        System.out.println("This is normal method 2");
    }
}
