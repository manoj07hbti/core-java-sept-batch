package conditional_statements;

public class ANDOperator {

    public static void main(String[] args) {

        int age=18;
        String city="AGRA";
//TRUE & TRUE= TRUE (1X1=1)

        if(age>=18 && city=="AGRA"){

            System.out.println("Person is eligible for Voting in AGRA City.....");
        }
        else {
            System.out.println("Person is NOT eligible for Voting in AGRA City.....");
        }

//TRUE & FALSE=FALSE(1X0=0)

        city="PUNE";
        if(age>=18 && city=="AGRA"){

            System.out.println("Person is eligible for Voting in AGRA City.....");
        }
        else {
            System.out.println("Person is NOT eligible for Voting in AGRA City : TRUE & FALSE=FALSE(1X0=0).....");
        }


// FALSE& TRUE =FALSE(0X1=0)

        age=15;
        city="AGRA";
        if(age>=18 && city=="AGRA"){

            System.out.println("Person is eligible for Voting in AGRA City.....");
        }
        else {
            System.out.println("Person is NOT eligible for Voting in AGRA City : FALSE& TRUE =FALSE(0X1=0)  .....");
        }

//FALSE&FALSE= FALSE(0X0=0)

        age=25;
        city="Delhi";

        if(age>=18 && city=="AGRA"){

            System.out.println("Person is eligible for Voting in AGRA City.....");
        }
        else {
            System.out.println("Person is NOT eligible for Voting in AGRA City : FALSE&FALSE= FALSE(0X0=0)  .....");
        }

    }
}
