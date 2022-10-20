package conditional_statements;

public class NesteIfandElse {

    public static void main(String[] args) {

        int number=2;

        if(number>0){

            if(number%2==0){

                System.out.println("EVEN NUMBER is : "+number);
            }
            else {

                System.out.println("ODD NUMBER is : "+number);
            }
        }
        else {

            System.out.println("Number should be greater than Zero ");
        }


    }
}
