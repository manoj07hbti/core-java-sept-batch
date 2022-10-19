package conditional_statements;

public class NOToperator {

    public static void main(String[] args) {

        int marks=23;

        if( marks>33){

            System.out.println("PASS THE EXAM");
        }
        else {
            System.out.println("NOT PASS THE EXAM");
        }

        if( !(marks<33)){

            System.out.println(" PASS THE EXAM");
        }
        else {
            System.out.println("NOT PASS THE EXAM");
        }


        String city="AGRA";

        if(city=="AGRA"){
            System.out.println("Person Belongs to AGRA");
        }
        else {
            System.out.println("Person does not Belongs to AGRA");
        }

        if(!(city=="AGRA")){
            System.out.println("Person does not Belongs to AGRA");
        }
        else {
            System.out.println("Person Belongs to AGRA");
        }

    }
}
