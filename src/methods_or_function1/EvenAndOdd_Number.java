package methods_or_function1;

import java.lang.reflect.Method;

public class EvenAndOdd_Number {

    public int Method(){
        int a = 100;
        for (int i=1; i<=100;i++){
            if (i%2==0){
                System.out.print(i +",");
            }
        }
        return 0;

    }
    public int odd(){
        int b = 100;
        for (int i=1;i<=100;i++){
            if (i%2-1==0){
                System.out.print(i+",");
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        EvenAndOdd_Number obj=new EvenAndOdd_Number();

        obj.Method();
        obj.odd();

    }
}
