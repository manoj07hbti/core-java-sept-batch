package assignment_Method;

public class Even_Odd {
    public void evenodd(){
        int num = 12;
        if ( num%2 == 0){
            System.out.println(num+" Is Even Number");
        }
        else {
            System.out.println(num+" Is Odd Number");
        }
//        return evenodd();
    }

    public static void main(String[] args) {
        Even_Odd obj = new Even_Odd();
        obj.evenodd();
    }
    }
