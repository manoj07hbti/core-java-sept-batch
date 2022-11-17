package exception;

public class ArrayException {

    public static void main(String[] args) {

        System.out.println("Array  Exception  :");

        try {
            int ar[] = {1, 3, 5, 7, 0, 4};
            System.out.println(ar[10]);
        }

        catch (Exception e) {


            System.out.println(e);
        }

        System.out.println("EXIT");
    }
}

