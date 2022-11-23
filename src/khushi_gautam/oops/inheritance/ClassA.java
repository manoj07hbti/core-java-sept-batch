package khushi_gautam.oops.inheritance;

public class ClassA {
    public void m1(){
        System.out.println("this is the m1 method of ClassA ");
    }
    public void m2(){
        System.out.println("this is the m2 method of ClassA ");
    }
    protected void m4(){
        System.out.println("this is m4 method of classA only for child class");
    }

    public static void main(String[] args) {
        ClassA obj= new ClassA();
        obj.m1();
        obj.m2();
    }
}
