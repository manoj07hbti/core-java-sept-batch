package metthod;

public class ReturnType_even {
    public String even(){
        int a=45;
        if (a%2==0){
            return"number is even.";
        }
           else{
               return"NUMBER IS ODD";
        }

    }

    public static void main(String[]Args){
        ReturnType_even even=new ReturnType_even();
        String result=even.even();
        System.out.println(result);

    }




}
