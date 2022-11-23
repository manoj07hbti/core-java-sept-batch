package imp_keywords.static_demo;



public class DemoStatic {

    //TODO a data which does not have static keyword will be called non static or data which belongs to object

    String name="Java";

    public static String m1(){

        System.out.println("This is STATIC METHOD M1 ");

        return "HELLO STATIC";
    }


    public static void main(String args[]){

    //SYNTAX: ClassName.MethodName();

      String msg=  DemoStatic.m1();


      System.out.println("out put : "+msg);

    }

}
