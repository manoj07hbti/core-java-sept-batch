package imp_keywords.static_demo;

public class Child extends DemoStatic {

    public static String m1(){

        System.out.println("This is CHILD STATIC METHOD M1");

        return "ABC";
    }

    public static void main(String[] args) {

        Child.m1();

        DemoStatic obj= new Child();
        obj.m1();
    }
}
