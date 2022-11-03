package methods_or_function;

public class Even_or_Odd {

    public String checkEvenOdd(){
        int a = 9;
        if(a%2==0){
            return"number is odd";
        }
     else{
         return"number is even";
        }


    }

    public static void main(String args[]){
        Even_or_Odd obj = new Even_or_Odd();
        String result = obj.checkEvenOdd();
                System.out.println(result);


    }







}
