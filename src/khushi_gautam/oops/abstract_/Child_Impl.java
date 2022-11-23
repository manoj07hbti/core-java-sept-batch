package khushi_gautam.oops.abstract_;

public class Child_Impl implements Demo_Interface{
    @Override
    public void m1() {
        System.out.println("implements");
    }

    @Override
    public void m2() {
        System.out.println("Implements");

    }

    public static void main(String[] args) {
        Child_Impl obj = new Child_Impl();
        obj.m1();
        obj.m2();
    }
}
