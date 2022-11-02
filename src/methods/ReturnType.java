package methods;

public class ReturnType {
    public String welcome(){
        String msg="Welcome to Java Programming.....";
        return msg;
    }
    public int number() {
        int a = 10;
        int b = 20;
        int add = a + b;
        return add;

    }
    public  double percentage(){
        int number=1255;
        int percentage=10;
        double formula=(double)(number*percentage)/100;//TODO TYPECASTING (DOUBLE)=(DOUBLE)
        return formula;
    }

    public static void main(String[] args) {


        ReturnType obj=new ReturnType();
        String object=obj.welcome();
        System.out.println(object);
        int result=obj.number();
        System.out.println("Addition of a and b :"+result);
        double answer=obj.percentage();
        System.out.println("The answer is "+answer);

    }}




