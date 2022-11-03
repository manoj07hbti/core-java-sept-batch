package metthod;

public class ReturnType_prime {
    public String checkprime(){
        int num=45;
        String result;
        boolean a=false;
        for (int i=2; i<num; i++){
            if (num % i==0){
                a=false;
                break;
            }
        }
        if (a==true){
            return "given number is not a prime number";
        }
        else {
            return "give number is a prime number";
        }

    }
    public static void main(String[]Args){
        ReturnType_prime obj=new ReturnType_prime();
        String output=obj.checkprime();
        System.out.println(output);


    }




}
