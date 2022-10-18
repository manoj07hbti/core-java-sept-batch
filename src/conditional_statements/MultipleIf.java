package conditional_statements;

public class MultipleIf {


    public static void main(String[] args) {

        int age=19;
        String city="AGRA";

       /* if(age>18){
            System.out.println("Eligible for voting ....");
        }
        if(city=="AGRA"){

            System.out.println("Eligible for voting in AGRA....");
        }*/

        if(age>18 && city=="AGRA"){

            System.out.println("Eligible for voting in Agra....");
        }


    }

}
