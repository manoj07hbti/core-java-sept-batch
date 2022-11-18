package exception_demo;

public class Demo_Exception {

    public void demo(int a,int b){

        try {
          int div=a/b;
          System.out.println("div is :"+div);

        }
        catch (Exception e){
            System.out.println("div is :"+e);
        }
        finally {
            System.out.println("this is finally block,it always get Exception");

        }



    }





    public static void main(String[]args){

        Demo_Exception obj=new Demo_Exception();
        obj.demo(24,0);





    }
}

