package input_type_assignment;

public class VotingEligibilityInputParam {

    public String eligibilty( String city , int age){

        if (age >= 18 && city == "CHENNAI") {

            return "Eligible for voting in CHENNAI..";
        } else {

            return "NOT Eligible for voting in CHENNAI..";
        }
    }


    public static void main(String[] args) {

        VotingEligibilityInputParam obj = new VotingEligibilityInputParam();
        String result = obj.eligibilty("CHENNAI",  20);
        System.out.println(result);

    }


}
