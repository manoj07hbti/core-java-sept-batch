package metthod;

public class ReturnTypeCalculator {
    public int add(){


        int a=45;
        int b=26;
        return a+b;

        }
    public int sub(){

        int a=89;
        int b=45;
        return a-b;
    }
    public int multi(){
        int x=46;
        int y=45;
        return x*y;

    }
    public int div(){
        int a=12;
        int b=13;
        return a/b;
    }
    public static void main(String[]args){
        ReturnTypeCalculator obj=new ReturnTypeCalculator();
        int add= obj.add();
        int sub= obj.sub();
        int multi= obj.multi();
        double div= obj.div();

        System.out.println("the sum of the given numb"+add);
        System.out.println("the sub of the given numb"+sub);
        System.out.println("the multi the give number"+multi);
        System.out.println("the div the given number"+div);
    }

}
