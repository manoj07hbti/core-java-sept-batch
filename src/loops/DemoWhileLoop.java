package loops;

public class DemoWhileLoop {

    public static void main(String[] args) {

        int i = 0;

        /*TODO SYNTAX: while (condition ){
                              CODE
                        INCREMENT/DECREMENT
                               } */
       while (i<5){

           System.out.println("This is While Loop "+i);
           i++;
       }

       i=10;

       while (i>0){

           System.out.println("This is DECREMENT While Loop "+i);
           i--;
       }


    }
}
