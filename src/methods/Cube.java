package methods;

public class Cube {
    public String even_and_odd() {
        long number = 244447844125512l;
        if (number % 2 == 0)
            return "number is even:" + number;
        else{
            return"number is odd:"+number;
        }

    }

    public static void main(String[] args) {
        Cube obj=new Cube();
        String result=obj.even_and_odd();
        System.out.println(result);
    }
}


