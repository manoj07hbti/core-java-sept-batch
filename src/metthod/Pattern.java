package metthod;

public class Pattern {
    // write the program using to print the following patter?
     //*
    //* *
    //* * *
    // * * * *
    static void patter1(int n){
        for (int i=0;i<n;i++) {
            for (int j = 0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    public static void main(String[]args){
        patter1(12);

    }
}
