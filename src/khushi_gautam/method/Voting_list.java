package khushi_gautam.method;

public class Voting_list {
    public int eligible(int value){
        int age=18;
        if (value>=age){
            System.out.println("You are eligible  for voting");
        }
        else {
            System.out.println("You are not eligible for voting");
        }
        return value;
    }

    public static void main(String[] args) {
        Voting_list obj= new Voting_list();
        int candidate = obj.eligible(19);
        System.out.println(candidate);
    }
}
