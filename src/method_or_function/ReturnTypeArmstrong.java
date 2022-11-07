package method_or_function;

public class ReturnTypeArmstrong {

    public int Armstrong() {

        int num = 371, digit, num1, sum = 0;

        while (num != 0) {
            digit = num % 10;
            num1 = digit * digit * digit;

            sum = sum + num1;

            num = num / 10;


        }
        return sum;
    }

    public static void main(String[] args) {

        ReturnTypeArmstrong value = new ReturnTypeArmstrong();

        int result = value.Armstrong();

        System.out.println(result);

        }

    }

