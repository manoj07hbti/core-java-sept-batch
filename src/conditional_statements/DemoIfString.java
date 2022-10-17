package conditional_statements;

public class DemoIfString {
    public static void main(String[] args) {

        String city="PUNE";

        if(city=="AGRA"){

            System.out.println("Person belongs to UTTAR PRADESH");
        }

        if(city=="PUNE"){

            System.out.println("Person belongs to Maharashtra !!!");
        }

        if(city=="GWALIOR"){

            System.out.println("Person belongs to Madhya Pradesh !!!");

        }

        if(city!="DELHI"){

           System.out.println("Person does not belongs to DELHI ....");
        }

    }
}
