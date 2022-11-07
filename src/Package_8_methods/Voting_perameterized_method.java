package Package_8_methods;



public class Voting_perameterized_method {
    public String checkVote(int a, String b){
        if(a>=18&& b== "AGRA"){
            return "you are eligible for voting";
        }
        else{
            return "you are not eligible for voting";
        }
    }

    public static void main(String[] args) {
        Voting_perameterized_method obj = new Voting_perameterized_method();
     String result =    obj.checkVote(19,"AGRA");
        System.out.println(result);

        }
}
