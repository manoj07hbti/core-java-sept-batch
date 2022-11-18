package khushi_gautam.collection.Hash_Map;
import java.util.TreeMap;

public class Demo_TreeMap {
    //todo TreeMap: this is only use for sorting automatically index wise data.
    public TreeMap<Integer, String> getDemo() {
        //todo syntax: HashMap<datatype_key,datatype_value> objName=new HashMap();
        TreeMap<Integer, String> demo = new TreeMap<>();
        demo.put(1,"khushi");
        demo.put(2,"Pradeep");
        demo.put(3,"Sweta");
        demo.put(4,"Garv");

        return demo;
    }

    public static void main(String[] args) {
        Demo_TreeMap obj= new Demo_TreeMap();
        TreeMap<Integer, String> demo= obj.getDemo();
        System.out.println("Printing key with value: "+demo);
        System.out.println(demo);
    }
}
