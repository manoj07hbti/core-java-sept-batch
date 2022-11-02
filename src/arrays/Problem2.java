package arrays;

public class Problem2 {
    public static void main(String[]Args){

        // Practice problem2
        //Todo Problem2=write a program to find the out whether a give integer is present in an array or not
        float Mask[]={45.7f,56.12f,65.7f};
        float number=100f;
        boolean isInArray=false;
        for (float element:Mask){
            if (number==element){
                isInArray=true;
                break;
            }
    }
        if (isInArray){
            System.out.println("the value of present in the array");

        }
        else {
            System.out.println("the value of not present in array ");
        }
    }
}
