package method_or_function;

public class EvenOdd {
    public void evenOdd(){
        int a=9;
        if (a%2==0){
            System.out.println("Number is EVEN");
        }
        else {
            System.out.println("Number is ODD");
        }
    }
    public void cube(){
        int a=33;
        int result=a*a*a;
        System.out.println("Cube of a is:"+result);
    }

    public static void main(String[] args) {
        EvenOdd obj=new EvenOdd();
        obj.evenOdd();
        obj.cube();
    }
}
