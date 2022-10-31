package array;

public class States_array {
    public static void main(String[] args) {
        String state[]={"PUNJAB","UP","MP","BIHAR","HARYANA","HP","GUJARAT"};
        for (int i=0; i< state.length; i++){
            System.out.println("Print state in for loop:"+state[i]);
        }
        for (String var: state){
            System.out.println("Print advance for loop:"+var);
        }
        int i=0;
        while (i< state.length){
            System.out.println("Print with while loop:"+state[i]);
            i++;
        }
    }
}
