package method_or_function;

public class ReturnTypeCheck_OddEven {

    public String checkOddEven() {

        int a = 50;
        if (a % 2 == 0) {

            return "NUMBER IS EVEN";
        } else {
            return "NUMBER IS ODD";

        }
    }

    public static void main(String[] args) {

        ReturnTypeCheck_OddEven num = new ReturnTypeCheck_OddEven();

        String output = num.checkOddEven();

        System.out.println(output);
    }
}
