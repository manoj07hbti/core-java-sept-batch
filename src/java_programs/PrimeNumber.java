package java_programs;

public class PrimeNumber {

    public static void main(String[] args) {

        int number=37;

        boolean flag=true;

     for(int i=2; i < number; i++) {

         if (number % i == 0) {
             flag = false;
             break;
         }

     }

     if(flag){
         System.out.println("Number is Prime number..."+number);
     }else {

         System.out.println("Number is NOT Prime number..."+number);
     }

    }
}
