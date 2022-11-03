package return_type_assignment;

public class PrimeNumber {

    public String PrimeNumberOrNot(){

        int number=20;

        boolean flag =true;

        for(int i=2; i < number; i++) {

            if (number % i == 0) {
                flag= false;
                break;
            }

        }

        if(flag){
            return "Prime Number";
        }
        else {
            return"Not a Prime Number";
        }

    }

    public static void main(String[] args){

        PrimeNumber obj = new PrimeNumber();
        String result = obj.PrimeNumberOrNot();
        System.out.println(result);

    }

}
