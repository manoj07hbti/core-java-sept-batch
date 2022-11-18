package khushi_gautam.oops_abstraction.inheritance;

public class classB extends ClassA {
    public void m3(){
        System.out.println("this is m3 method of classB ");
    }
    //todo override
    public void m1(){
        System.out.println("I am child class");
    }
    public static void main(String[] args) {
        classB obj= new classB();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
