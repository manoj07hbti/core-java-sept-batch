package return_type_assignment;

public class ReturnTypeCalculator {

    public int addition(){
        int a=63;
        int b=36;
        int sum=a+b;
        return sum;
    }
    public int subtraction(){
        int x=98;
        int y=100;
        int sub=x-y;
        return sub;
    }
    public int product(){
        int a=78;
        int b=87;
        int multi=a*b;
        return multi;
    }
    public int division(){
        int x=84;
        int y=12;
        int div=x/y;
        return div;
    }

    public static void main(String[] args) {

        ReturnTypeCalculator cal=new ReturnTypeCalculator();

        int sum = cal.addition();
        System.out.println(sum);

        int sub= cal.subtraction();
        System.out.println(sub);

        int multi = cal.product();
        System.out.println(multi);

        int div = cal.division();
        System.out.println(div);

    }

}
