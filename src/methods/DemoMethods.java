package methods;

public class DemoMethods {
    // todo syntax access_Specifier return_Type method_Name (parameter)(CODE....)
    public void eatMethod(){
        System.out.println("This Is eat Method");

    }
    public void sleepMethod(){
        System.out.println("This is SleepMethod");
    }
    public void runMethod(){
        System.out.println("This is  Run Method");
    }

    public static void main(String[] args) {
        DemoMethods obj=new DemoMethods();
            obj.eatMethod();
            obj.sleepMethod();
            obj.runMethod();

        }
    }


