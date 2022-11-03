package methods;

public class EvenAndOdd {
    public String checkEvenOrOdd(){
    int number = 50;
    if(number%2==0) {
        return "number is even:"+number;
    }
    else

    {
        return "number is odd:"+number;
    }

}

    public static void main(String[] args) {
        EvenAndOdd result=new EvenAndOdd();
        String Find=result.checkEvenOrOdd();
        System.out.println(Find);
    }





}
