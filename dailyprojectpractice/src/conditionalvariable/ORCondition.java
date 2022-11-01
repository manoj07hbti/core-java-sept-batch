package conditionalvariable;

public class ORCondition {
    public static void main(String args[]){

        int age=18;
        String city="pune";
      // TODO true|| true= true(1+1=1) when both condition is true then output always comes true

        if( age>=18 || city=="pune"){
            System.out.println("person is eleigible for voting and also resident of pune");
        }
         else{
             System.out.println("person is not eligible for voting and if he is not resident of pune");
        }
         // TODO TRUE||FALSE=TRUE (1+0=1) when one condition is true and one is false but output always comes true

         age =18;
         city="delhi";
         if(age>=18|| city=="pune"){
             System.out.println("person is eleigible for voting and also resident of pune");
         }
         else{System.out.println("person is not eleigible for voting and also not  resident of agra");

         }

         // TODO FASLE||TRUE=TRUE (0+1=1) when one condition is false and one is true but output always comes true

        age=10;
        if(age>=18|| city=="delhi"){
            System.out.println("person is eleigible for voting and also resident of pune");
        }
        else{System.out.println("person is not eleigible for voting and also not  resident of agra");

        }

        // TODO FALSE|| FALSE= FALSE(0+0=0) when both condition os false then output comes false

        age=10;
        city="alighar";
        if(age>=18|| city=="delhi"){
            System.out.println("person is eleigible for voting and also resident of pune");
        }
        else{System.out.println("person is not eleigible for voting and also not  resident of agra");

        }










    }
}
