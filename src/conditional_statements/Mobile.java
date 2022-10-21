package conditional_statements;

public class Mobile {

    public static void main(String[] args) {

        long mobile=122122278L;

        if(mobile>6000000000L & mobile< 9999999999L){

            //TODO EVEN ODD LOGIC

            System.out.println("valid mobile number..");
        }

        else {
            System.out.println("Not a valid mobile number..");
        }

        //TODO second way :
        Long x = 1234567890L;
        String number=Long.toString(x);

        if(number.length()==10 & x>6000000000L){

            System.out.println("Valid number ");
        }
        else {
            System.out.println("Not Valid number ");

        }


    }
}
