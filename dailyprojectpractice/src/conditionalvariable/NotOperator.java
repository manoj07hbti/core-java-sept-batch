package conditionalvariable;

public class NotOperator {
    public static void main(String args[]){

        int num= 12;
        String name="Khushi";


        if(!(num>=25 && name=="khushi")){
            System.out.println("Khushi is very happy to celebrate 25 birthday");
        }
        else{
            System.out.println("Khushi is Not  happy to celebrate 25 birthday");

        }
    }

}
