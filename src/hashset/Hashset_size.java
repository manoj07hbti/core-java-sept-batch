package hashset;

import java.util.HashSet;

public class Hashset_size {

    public static void main(String[]Args){

        HashSet<Integer> Set=new HashSet<>();
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        Set.add(5);
        Set.add(5);



        System.out.println("size of set is:"+Set.size());
        System.out.println(Set);




    }

}
