package oop;

public interface Shape {

   public static final int i=34;
    public  abstract void calculateArea(int a);
}


class circle implements Shape{

    public void calculateArea(int a){

        System.out.println("Area of is circle is "+(Math.PI*a*a));
    }


    public static void main(String[]args){

        Shape shape=new circle();
        shape.calculateArea(2);

    }
}
