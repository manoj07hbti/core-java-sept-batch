package loops;

public class DemoForLoop {

    public static void main(String[] args) {



   //*TODO SYNTAX : for(initialization; condition; increment){ statement or code to be executed } */

       for (int i=1; i<=5; i++){

           System.out.println("INCREMENT LOOP :Welcome To Java Programming ...."+i);
       }

        //*TODO SYNTAX : for(initialization; condition; DECREMENT){ statement or code to be executed } */

        for (int i=5; i>0 ; i--){

            System.out.println("DECREMENT LOOP : Welcome To Java Programming ...."+i);
        }

        //INFINITE LOOP

        for (int i=0; i>=0; i++){

            System.out.println("INFINITE LOOP "+i);

        }
    }
}
