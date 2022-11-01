package conditionalvariable;

public class citystring {
          public static void main(String args[]){
              String city = "gwalior";
              if(city=="jaipur"){
                  System.out.println("person belongs to Rajasthan");
              }

              if(city=="Noida"){
                  System.out.println("person belongs to uttar pradesh");
              }
              if(city=="gwalior"){
                  System.out.println("person belongs to madhya pradesh");
              }

               int age=16;
               String fruit= "mango";
              if(fruit=="mango" && age>18 ){

                   System.out.println("person is eligible for vote and ready to eat mango");
              }
              else{
                  System.out.println("person is not eligible for vote and not ready to eat mango");
              }



          }



}


