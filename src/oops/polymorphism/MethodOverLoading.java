package oops.polymorphism;

public class MethodOverLoading {

    public void m1(){

        System.out.println("This is normal method...");
    }

    public void m1(int a){

        System.out.println("This is Overloaded  method with int parameter...");
    }

    public void m1(String a){

        System.out.println("This is Overloaded  method with String parameter...");
    }
// we can not change return type on method overloading
    /*public int m1(String a){

        System.out.println("This is Overloaded  method with String parameter...");

        return 1;
    }*/

    public void m1(int a, String b){

        System.out.println("This is Overloaded  method with int and String parameter...");
    }


    public static void main(String[] args) {

        MethodOverLoading obj= new MethodOverLoading();

        obj.m1();
        obj.m1(3);
        obj.m1("ABC");
        obj.m1(3,"XYZ");

    }

}
