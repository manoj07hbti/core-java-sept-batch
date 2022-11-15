package collection;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_New {

    public HashMap<Integer,Integer> Great(){
        HashMap<Integer,Integer> mummy= new HashMap();

        mummy.put(11,11);
        mummy.put(12,12);
        mummy.put(21,21);

        return mummy;


    }

    public static void main(String[] args) {
        Hashmap_New obj= new Hashmap_New();
        HashMap<Integer,Integer> mummy=obj.Great();

        Set<Integer> keys= mummy.keySet();

        for (Integer var : keys){
            System.out.println(mummy.get(var));
        }

    }
}
