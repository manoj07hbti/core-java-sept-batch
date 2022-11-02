package Package_8_methods;

public class ReturnType_method_cube {
    public int cube(){
        int a = 115;
        return a*a*a;
    }

    public static void main(String[] args) {
        ReturnType_method_cube num = new ReturnType_method_cube();
        int result = num.cube();
        System.out.println("the cube of the given number is " +result);
    }
}

