package arrays;


public class Matrix {
    public static void main(String[] args) {

        int matrix[][]= {{5, 3, 4}, {4, 5, 6},{7,5,9}};
        for (int i =0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}