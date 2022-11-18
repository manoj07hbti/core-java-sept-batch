package khushi_gautam.collection.Hash_Map;
import java.util.HashMap;
public class Demo_TreeMap {
    //todo TreeMap: this is only use for sorting automatically index wise data.
    public HashMap<Integer, String> getDemo() {
        //todo syntax: HashMap<datatype_key,datatype_value> objName=new HashMap();
        HashMap<Integer, String> demo = new HashMap<>();
        demo.put(1,"khushi");
        demo.put(2,"Pradeep");
        demo.put(3,"Sweta");
        demo.put(4,"Garv");

        return demo;
    }

    public static void main(String[] args) {
        Demo_TreeMap obj= new Demo_TreeMap();
        HashMap<Integer, String> demo=obj.getDemo();
        for (Integer var:demo.keySet()){
            System.out.println("Printing key with value: "+demo.get(var));
        }
        System.out.println(demo);
    }
}
