package conditional_statements;

public class DemoIfAndElse {

    public static void main(String[] args) {

        int age=15;

        if(age>18){

            System.out.println("Eligible for Voting ....");
        }
        else {
            System.out.println("NOT Eligible for Voting ....");
        }

        String city="Delhi";

        if(city=="AGRA"){

            System.out.println("Person belongs to AGRA..");
        }
        else {
            System.out.println("Person do not  belongs to AGRA..");
        }

    }
}
