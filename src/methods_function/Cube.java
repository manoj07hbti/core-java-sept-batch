package methods_function;

public class Cube {

    // Todo : create method
    // Syntax :  access_specifier return_type  method_name (parameter) {CODE..}

    public int makeCube() {
        int number = 5;
        int cube = number * number * number;
        return cube;
    }

    public static void main(String[] args) {
        // create object by the constructor method
        // ClassName ObjectName = new ClassName();

        Cube obj = new Cube();
        int output = obj.makeCube();
        System.out.println(output);
    }
}
