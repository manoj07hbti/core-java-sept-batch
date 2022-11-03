package method_or_function;

public class ReturnTypePrime {


    public String checkPrime() {


        int num = 21;
        boolean flag = false;
        for (int i = 2; i <= num/2 ; i++) {

            if (num % i == 0) {
            flag = true;
                break;
            }
        }

        if (flag) {

            return "NUMBER is not a prime number";
        } else {

            return "NUMBER is a prime number";

        }
    }

    public static void main(String[] args) {

        ReturnTypePrime value = new ReturnTypePrime();

        String number = value.checkPrime();

        System.out.println(number);
    }
}

