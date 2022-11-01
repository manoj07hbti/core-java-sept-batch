package conditionalvariable;

public class NestedIFandElse {
    public static void main(String args[]){
        long number= 8624688242L;
        if(number/1000000000L>=1){
            if(number%2==0){
                System.out.println("the number has 10 digita and shows EVEN number");
            }
            else{
                System.out.println("the number has 10 digita and shows ODD number");

            }
        }
        else{
            System.out.println("the number should be at least 10 digit");

        }

    }




}
