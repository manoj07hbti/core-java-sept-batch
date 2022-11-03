package method_or_function;

public class PrimeNumber {

    public void primeNumber(){
    int number=7;
    boolean flag=true;
    for(int i=2; i<number; i++){
       if (number%i==0){
           flag=false;
           break;
       }
       if (flag){
           System.out.println("Number is Prime Number");
           break;
       }
       else {
           System.out.println("Number is not Prime Number");
       }
    }
    }

    public static void main(String[] args) {
        PrimeNumber obj=new PrimeNumber();
        obj.primeNumber();
    }
}
