package arrays;

public class problem3 {

    // problem3
    // Todo =calculate the average mask form an array containing marks of all student in physics using for each loop

public static void main(String[]Args) {


    float Marks[] = {78.4F, 45.2F, 65.5F, 66.2F};
    float sum = 0;
    for (float element: Marks) {
        sum = sum + element;
    }
    System.out.println("the value of average marks is "+sum/Marks.length);

}
    }

