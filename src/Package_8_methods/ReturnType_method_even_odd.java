package Package_8_methods;

public class ReturnType_method_even_odd {
    public String checkEvenOdd(){
        int a = 51;
        if (a%2==0){
            return "number is even.";
        }
        else {
            return "number is odd.";
        }
    }

    public static void main(String[] args) {
        ReturnType_method_even_odd num = new ReturnType_method_even_odd();
       String result = num.checkEvenOdd();
        System.out.println(result);
    }
}
