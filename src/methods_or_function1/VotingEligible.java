package methods_or_function1;

public class VotingEligible {

    public String checkEligible(int age , String city){

        if (age>=18 && city == "Agra"){

            return "Eligible for voting in Agra";
        }
        else {
            return "Not Eligible for voting in Agra";
        }
    }

    public static void main(String[] args) {
        VotingEligible obj = new VotingEligible();
        String result=obj.checkEligible(19,"Agra");
        System.out.println(result);

    }
}
