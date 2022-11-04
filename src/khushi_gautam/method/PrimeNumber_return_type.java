package khushi_gautam.method;

public class PrimeNumber_return_type {
    public boolean primeNumber() {
        int number = 36;
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false; // not a prime number
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        PrimeNumber_return_type obj = new PrimeNumber_return_type();
        boolean result = obj.primeNumber();
        if (result) {
            System.out.println(" Prime number ");
        } else {
            System.out.println("Not a Prime number ");
        }
    }
}