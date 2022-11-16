package aj_loop_programs;

public class CompoundInterest {
    public static void main(String[] args) {
        int amount=1000;
        int interestRate= 5;
        int time=3;
        double temp=1;
        while(time>0){
            temp= temp*(1+(double) interestRate/100);
            time--;
        }
        double totalAmount= amount*temp;
        System.out.printf("Total amount is %.2f",totalAmount);
    }
}
