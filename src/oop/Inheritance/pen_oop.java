package oop.Inheritance;

public class pen_oop  {



    public void pen1(){

        String color="blue";
        String brand="cello";
        String type="write";
        System.out.println("pen1 :"+color+":"+brand+":"+type+":");



    }
    public void pen2(){
        String  color="black";
        String brand="bosky";
        String type="writing";

        System.out.println("pen2:"+color+":"+brand+":"+type+":");

    }
    public void pen3(){
        String  color="green";
        String brand="ocean";
        String type="writing";

        System.out.println("pen2:"+color+":"+brand+":"+":"+type+":");



    }
    protected void pen4(){

        String  color="red";
        String brand="premium BollPen";
        String type="write";

        System.out.println("pen4:"+color+":"+brand+":"+type+":");


    }




    public static void main(String[]args){
        pen_oop pen=new pen_oop();
        pen.pen1();
        pen.pen2();
        pen.pen3();
        pen.pen4();

    }

}
