package class_and_object1;

public class DemoMobile {
    String brandname= "Samsung";
    String ram="16GB";
    String camera="48MP";
    int price= 10000;

    public static void main(String[] args) {
        DemoMobile obj = new DemoMobile();
        System.out.println("Brand Name--"+obj.brandname);
        System.out.println("Brand Ram--"+obj.ram);
        System.out.println("Brand Camera--"+obj.camera);
        System.out.println("Brand Price--"+obj.price);
    }

}
