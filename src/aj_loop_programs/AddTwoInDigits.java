package aj_loop_programs;

public class AddTwoInDigits {
    public static void main(String[] args) {
        int number=123456789;
        int digit;
        int multi=1;
        int output=0;
        while (number>0){
            digit=number%10;
            digit+=2;
            if(digit>=10)
                digit%=10;
            number/=10;
            output=output+multi*digit;
            multi*=10;
        }
        System.out.println(output);
    }
}