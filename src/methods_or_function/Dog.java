package methods_or_function;

public class Dog {

    //properties or data members
    String breedName;
    int age;
    int height;

 /* todo    Member function or method -- capabilities
        Syntax : access_specifier return_type  method_name (parameter) {CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/
    // capabilities

    //eat,
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    //STEP 1
    public void eatMethod(){

        System.out.println("This is Eat Method...");
    }

    // sleep

    public void sleepMethod(){

        System.out.println("This is SLEEP method..");
    }

    // , run

    public void runMethod(){

        System.out.println("This is RUN method..");
    }

    public static void main(String[] args) {

     //STEP 2
        Dog obj = new Dog(); // OBJECT CREATED
        obj.eatMethod();  // objName.MethodName(); --> it is calling eat Method

        //objName.MethodName();

        obj.sleepMethod();// call sleep method

        obj.runMethod();// it will call run method
    }

}
