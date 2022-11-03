package methods_or_function1;

public class DemoCube {

    public int cube(){

        int a =4;
        int cube=a*a*a;
        return cube;
    }

    public static void main(String[] args) {
        DemoCube obj = new DemoCube();
        int cube= obj.cube();  //for the store value I can use int cube
        System.out.println("This is cube value,="+cube);

    }
}
