package methods_or_function;

public class Method_returnType {

 public int makeCube (){
     System.out.println("This is a cube Method");

  int number = 5;
    int cube = number*number*number;
     return  cube;

 }
 public int subtract(){
     System.out.println("This is a subtract Method");
     int a=6;
     int b=9;
     int subtract= a-b;
     return subtract;

 }


 public int makeDevide(){
     System.out.println("This is a devide method");
     int a = 25;
     int b = 5;
     int devide = a/b;
     return devide;


 }

    public static void main(String[] args) {

      Method_returnType obj = new Method_returnType();

        int result= obj.makeCube();

        System.out.println("cube is "+result);

        int devide = obj.makeDevide();

        System.out.println("devide is "+devide);

        int subtract=obj.subtract();
        System.out.println("subtract is "+subtract);





    }

}
