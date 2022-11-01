package conditional_statements;

public class ORoperator {

    public static void main(String[] args) {

        String brand="LENOVO";
        int ram=8;

//TODO  TRUE || TRUE= TRUE (1+1=1)

        if(brand=="LENOVO" || ram>=8){ // condition1-brand=="LENOVO"=true condition 2- ram>=8=true

            System.out.println("Good Configuration Laptop : TRUE || TRUE= TRUE (1+1=1) ....");
        }
        else {
            System.out.println("Not Good Configuration ..");
        }

//TODO TRUE || FALSE= TRUE (1+0=1)
        ram=6;

        if(brand=="LENOVO" || ram>=8){ // condition1 -brand=="LENOVO"=true  condition 2- ram>=8: false

            System.out.println("Good Configuration Laptop : TRUE || FALSE= TRUE (1+0=1) ....");
        }
        else {
            System.out.println("Not Good Configuration ..");
        }

//TODO  FALSE || TRUE= TRUE (0+1=1)

        brand="DELL";
        ram=8;
        if(brand=="LENOVO" || ram>=8){ // condition1-brand=="LENOVO"=false  condition 2- ram>=8: true

            System.out.println("Good Configuration Laptop : FALSE || TRUE= TRUE (0+1=1) ....");
        }
        else {
            System.out.println("Not Good Configuration ..");
        }

//TODO FALSE || FALSE= FALSE(0+0=0)
        brand="DELL";
        ram=6;
        if(brand=="LENOVO" || ram>=8){ // condition1-brand=="LENOVO"=false  condition 2- ram>=8: false

            System.out.println("Good Configuration Laptop : FALSE || TRUE= TRUE (0+1=1) ....");
        }
        else {
            System.out.println("Not Good Configuration ..: FALSE || FALSE= FALSE(0+0=0)");
        }


    }
}
