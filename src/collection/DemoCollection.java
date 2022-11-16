package collection;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.ArrayList;

public class DemoCollection {
    public void storeInformation() {
        ArrayList list = new ArrayList();
        list.add("AGRA");
        list.add("DELHI");
        list.add("PUNe");
        list.add("KANPUR");
        list.add(34);
        list.add(34.1525864);
        System.out.println("CITIES I LIKE MOST:" + list.get(3));
        System.out.println("remove city:" + list.remove(2));
        System.out.println("total size:" + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            for (Object var : list) {
                System.out.println("advanced for loop "+var);
            }
        }

    }

    public static void main(String[] args) {
        DemoCollection obj=new DemoCollection();
        obj.storeInformation();
    }

}
