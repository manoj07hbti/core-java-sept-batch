package method_and_function1;

public class Calculator {
    //add
    public void add(){
        int a=23;
        int b=12;
        int result= a+b;
        System.out.println("this is add method,"+result);
    }
    //sub
    public void sub(){
        int a = 60;
        int b = 20;
        int resutl=a-b;
        System.out.println("This is Subtraction method,"+resutl);
    }
    public void multi(){
        int a = 12;
        int b = 12;
        int result = a*b;
        System.out.println("This is multification methos,"+result);
    }
    public void div(){

        int a = 10;
        int b = 2;
        int result=a/b;
        System.out.println("This is div method,"+result);
    }

    public static void main(String[] args) {
        Calculator obj =new Calculator();
        obj.add();
        obj.sub();
        obj.multi();
        obj.div();
    }
}
