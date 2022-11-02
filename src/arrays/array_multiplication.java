package arrays;

public class array_multiplication {
    public static void main(String[] args) {
    int[][] array1 = {{2,4},     // 1--->11 23       3----> 31   43
                      {5,6}};     // 2--->12 24      4----> 32  44
    int[][] array2 = {{1,2},
                      {3,4}};
    int[][] finalArray = new int[2][2];
    int sum = 0;
//finalArray[0][0] = array1[0][0]*array2[0][0]+array1[0][1]*array2[1][0];
        //System.out.println(finalArray[0][0]);
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                for (int k =0;k<2;k++) {
                    sum = sum + array1[i][k]*array2[k][j];
                }
                finalArray[i][j] = sum;
                sum=0;
            }
        }
        System.out.print(finalArray[0][0]+ " ");
        System.out.println(finalArray[0][1]);
        System.out.print(finalArray[1][0]+" ");
        System.out.println(finalArray[1][1]);
}
}