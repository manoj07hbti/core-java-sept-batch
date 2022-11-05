package methods;

public class VotingEligibility {
    public String Voting(int num,String name){
        if(num>=18&& name=="AGRA"){
            return "Person is eligible for voting in agra";
        }
        else {
            return "not eligible for voting in agra";
        }
    }

    public static void main(String[] args) {
        VotingEligibility obj=new VotingEligibility();
        String result=obj.Voting(19,"AGRA");
        System.out.println(result);


    }


}
