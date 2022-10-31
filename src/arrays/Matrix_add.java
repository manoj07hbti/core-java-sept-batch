package arrays;

public class Matrix_add {
    public static void main(String[] args) {


    int matrix[][]= {{5, 3, 4}, {4, 5, 6}};
    int matrix2[][] = {{5,8,9},{6,8,4}};
    int finalMat[][] = {{0,0,0},{0,0,0}};
    finalMat[0][0]=matrix[0][0]+matrix2[0][0];
        for (int i =0; i<matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            finalMat[i][j]=matrix[i][j]+matrix2[i][j];
            System.out.print(finalMat[i][j] + " ");
        }
        System.out.println();
    }
}
}
