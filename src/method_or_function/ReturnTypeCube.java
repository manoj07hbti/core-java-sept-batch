package method_or_function;

public class ReturnTypeCube {

    public int cube() {

        int a = 10;
        int cube = a * a * a;
        return cube;
    }

    public static void main(String[] args) {

        ReturnTypeCube value = new ReturnTypeCube();

            int output = value.cube();

        System.out.println("CUBE OF NUMBER : " +output);


    }
}

