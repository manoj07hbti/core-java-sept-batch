package return_type_assignment;

public class EvenOdd {

    public String evenodd() {

        int num = 88;
        if (num%2 == 0){
            return "EVEN";
        }
        else{
            return "ODD";
        }

    }

    public static void main(String[] args){

        EvenOdd evn= new EvenOdd();
        String result = evn.evenodd();
        System.out.println(result);

    }



}
