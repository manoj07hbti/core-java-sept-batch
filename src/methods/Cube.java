package methods;

public class Cube {
    public int cube(){
        int a=3;
        int cube=a*a*a;
        System.out.println("cube of "+a+":");
        return  cube;
    }

    public static void main(String[] args) {
        Cube obj=new Cube();
        int result=obj.cube();
        System.out.println(result);
    }
}
