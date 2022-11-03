package assignment_Method;

public class Method_Cube {

    public int cube(){
        int num = 5;
        int cube1 = num*num*num;
        return cube1;
    }

    public static void main(String[] args) {
        Method_Cube obj = new Method_Cube();
        int output = obj.cube();
        System.out.println("Cube of 5 is " + output );
    }

}
