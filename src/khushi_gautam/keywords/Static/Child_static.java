package khushi_gautam.keywords.Static;

public class Child_static extends static_demo {
    public static void method(){
        System.out.println("this is  child static method");
    }

    public static void main(String[] args) {
       Child_static.method();

       static_demo obj= new Child_static();
       obj.method();
    }
}
