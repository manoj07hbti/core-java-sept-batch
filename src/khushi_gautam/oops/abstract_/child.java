package khushi_gautam.oops.abstract_;

public class child extends Demo_Abstract {

    @Override
    public void m1() {
        System.out.println("this is implement");
    }

    public static void main(String[] args) {
        child obj= new child();
        obj.m1();
    }
}
