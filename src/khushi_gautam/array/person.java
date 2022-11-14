package khushi_gautam.array;

public class person {
    String name;
    String status;
    int children;
    // parameterized constructor

    public person(String name, String status, int children) {
        this.name = name;
        this.status = status;
        this.children = children;
    }

    public static void main(String[] args) {
        person per = new person("Karan", "single", 0);
        person per1 = new person("Ashish", "married", 2);
        person per2 = new person("Fahad", "married", 4);

        System.out.println("Name:"+per.name+"  Status:"+ per.status+"   Childen:"+per.children);
        System.out.println("Name:"+per1.name+"  Status:"+ per1.status+"   Childen:"+per1.children);
        System.out.println("Name:"+per2.name+"  Status:"+ per2.status+"   Childen:"+per2.children);

    }
}
