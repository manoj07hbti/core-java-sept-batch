package methods_or_function;

public class MethodInputParam {

    //access_specifier return_type  method_name (Datatype varName) {CODE..}
    public String welcome(String name) {


        String msg = "Welcome to java Programming " + name;

        return msg;
    }


    public int makeSquare(int number) {

        int square = number * number;

        return square;
    }


    public String checkEligibilty(int age, String city) {

        if (age >= 18 && city == "AGRA") {

            return "Eligible for voting in AGRA..";
        } else {

            return "NOT Eligible for voting in AGRA..";
        }

    }

    public static void main(String[] args) {
        MethodInputParam obj = new MethodInputParam();
        String result = obj.welcome("Raj"); // we need pass value of input

        System.out.println(result);

        result = obj.welcome("Rahul");
        System.out.println(result);

        int square = obj.makeSquare(3);// we need to pass value of input
        System.out.println("square is :" + square);

        square = obj.makeSquare(9);
        System.out.println("square is :" + square);

        String eligibilty = obj.checkEligibilty(17, "AGRA");

        System.out.println(eligibilty);

        eligibilty = obj.checkEligibilty(19, "AGRA");
        System.out.println(eligibilty);
    }
}
