package methods_or_function1;

public class TestMethodInputParam {

    //access_specifier return_type  method_name (Datatype varName) {CODE..}

    public String welcome(String name){
        String str="welcome to java program"+name;

        return str;

    }
    public int square(int number){

        int square=number*number;
        return square;
    }


    public static void main(String[] args) {
        TestMethodInputParam obj = new TestMethodInputParam();
        String result = obj.welcome("Jaydeep");
        System.out.println(result);

        result = obj.welcome("Neeraj Kumar");
        System.out.println(result);

        int square =obj.square(12);
        System.out.println(square);


    }
}
