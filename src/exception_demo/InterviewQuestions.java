package exception_demo;

import java.io.IOException;

public class InterviewQuestions {

    public void demo(int a, int b){

        try{
            int divide=a/b;
            System.out.println("Divide is : "+divide);
        }
        catch (NullPointerException e){
            System.out.println("Null pointer");
        }
        catch (Exception e){

            System.out.println("Catch block Exeption : "+e);
        }

        finally {
            System.out.println("This is finally block, it always gets executed ");
        }

    }


    public void demo2(){

        try{
            System.out.println("Some code");
        }

        catch (NullPointerException e){

        }

        catch (Exception e){

        }



    }


    public static void main(String[] args) {

        InterviewQuestions obj= new InterviewQuestions();
        obj.demo(24,0);

    }
}
