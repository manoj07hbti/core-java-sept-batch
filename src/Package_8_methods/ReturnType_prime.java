package Package_8_methods;

public class ReturnType_prime {
    public String checkPrime() {
        int num = 31;
        boolean b = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                b = true;
                return "given number is not a prime number";
            }
        }

                return "given number is a prime number";
    }
     /*   if (b){
            return "given number is not a prime number";
        }
        else {
            return "given number is a prime number";
        }
    }*/

    public static void main(String[] args) {
        ReturnType_prime num = new ReturnType_prime();
        String result = num.checkPrime();

        System.out.println(result);
    }
}


