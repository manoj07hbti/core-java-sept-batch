package conditional_statements;

public class DemoIf {

    public static void main(String[] args) {

      int age=19;

      if(age<18){ //19<18--> false

          System.out.println("Person is Child...");
      }

      if(age>18){ // 19>18 -->true

          System.out.println("Person is Young");
      }


      int height=4;

      if(height>=6){

          System.out.println("Person is very tall");
      }

      if(height<6 && height>5){
          System.out.println("Person is Medium tall");
      }

      if(height<5){

          System.out.println("Person is very less tall");
      }

    }
}
