package khushi_gautam.Excaption;

public class Interview_Question {
    public void demo(){
        try {
            System.out.println("this only try");
        }
        catch (NullPointerException e1){
            System.out.println("Null pointer exception");
        }
        catch (Exception e){
            System.out.println("catch block exception:"+e);
        }
    }
    public void demo1(int a, int b){
        try {
            int divide=a/b;
            System.out.println("divide is: "+divide);
        }
        finally {
            System.out.println("finally block is always execute");
        }

    }
    public void demo2(int a, int b){
        try {
             int divide1=a/b;
            System.out.println("divide is: "+divide1);
        }
        finally {
            System.out.println("finally block is always execute");
        }
    }

    public static void main(String[] args) {
        Interview_Question obj=new Interview_Question();
        obj.demo();
        obj.demo1(4,8);
        obj.demo2(7,0);
    }
}
