package conditionalvariable;

public class ANDCondition {
    public static void main(String args[]){

        int num=75;
        String status = "pass";

        // TODO TRUE & TRUE= TRUE (1X1=1) if both codition is  ture

        if(num>=75 && status =="pass"){
            System.out.println("Student got 80 percentage and pass all the subject");
        }
        else{
            System.out.println("Student got less than 80 percentage and pass fail in two  subject");
        }
      // TODO TRUE & FALSE=FALSE(1X0=0) in this case one condition is true and one is false
        String city="pune";
        if(num>=75 && city=="agra") {
            System.out.println("In agra city their is  child is new born information is true");
        }
         else{
            System.out.println("In agra city their is  child is new born information is false");
         }

         // TODO FALSE& TRUE =FALSE(0X1=0) if one condition is false and one is
        num=10;
         city="agra";
         if(num>=25 && city=="agra"){
             System.out.println("person is eligibleto go anywhere in agra");
         }
         else{
             System.out.println("person is  not eligibleto go anywhere in agra");
         }
         // TODO FALSE&FALSE= FALSE(0X0=0) if both condition is false

        num=25;
         city="Rajasthan";
         if( num>=20 && city=="mumbai"){
             System.out.println("their is more than 20 town in mumbai");
         }
         else {
             System.out.println("their is less than 20 town in mumbai");

         }
    }



}
