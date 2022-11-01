package conditionalvariable;

public class Voting_class {

    public static void main(String args[]){
         int voter =25;
         if(voter>18){
             System.out.println("voter is eligible for voting");
         }

         if(voter<18){
             System.out.println("Voter is not eligible for voting");
         }

         if(voter>=18){
             System.out.println("voter is also eligible for voting");
         }



    }
}
