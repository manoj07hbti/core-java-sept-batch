package return_type_assignment;

public class Cube {

    public int makeCube(){

        int a= 34;
        int cube=a*a*a;
        return cube;
    }

    public static void main(String[] args){

        Cube obj = new Cube();
        int result = obj.makeCube();
        System.out.println(result);
    }

}
