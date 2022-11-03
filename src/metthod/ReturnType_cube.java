package metthod;

public class ReturnType_cube {
    public int cube(){
        int a=12;
        return a*a*a;


    }
    public static void main(String[]Args){
        ReturnType_cube cub=new ReturnType_cube();
        int result=cub.cube();
        System.out.println("cube the given number"+result);


    }

}

