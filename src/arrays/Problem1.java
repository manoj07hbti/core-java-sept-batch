package arrays;

public class Problem1 {

    public static void main (String[]args){
        // Todo problem 1 =write the java program to revers an array?
        int [] arr={1,4,3,5};
        int l=arr.length;
        int a= Math.floorDiv(l,2);
        for (int i=0;i<a;i++){
            int temp;

            for (int i1=0;i1<l;i1++){
                temp =arr[i1];
                arr[i1]=arr[l-i1-1];
                arr[l-i1-1]=temp;

            }
            for(int obj :arr){
                System.out.println(obj+ "");
            }
        }


    }
}
