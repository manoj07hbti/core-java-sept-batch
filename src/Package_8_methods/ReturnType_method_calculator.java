package Package_8_methods;

public class ReturnType_method_calculator {
    public int add(){
        int a = 15;
        int b = 20;
        return a+b;
    }
    public int sub(){
        int a=100;
        int b = 50;
        return a-b;
    }
    public int multi(){
        int a=10;
        int b=50;
        return a*b;
    }
    public double divide(){
        int a= 158;
        int b=12;
        return (double)a/b;
    }

    public static void main(String[] args) {
        ReturnType_method_calculator calc = new ReturnType_method_calculator();
        int sum = calc.add();
        int sub = calc.sub();
        int multi = calc.multi();
       double divide = calc.divide();
        System.out.println("the sum of the given number is " +sum+"\n"+
        "the subtraction of given number is " +sub+"\n"+
        "the multiplication of given number is " +multi+"\n"+
        "the division of given number is " +divide);



    }

}
