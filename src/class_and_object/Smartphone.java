package class_and_object;

public class Smartphone {
    String brand = "LG g8x thinq";
    int camera = 12;
    String screen = "6.7 inches";

    public static void main(String[] args) {
        Smartphone lg = new Smartphone();
        System.out.println(lg.brand);
        System.out.println(lg.screen);
        System.out.println(lg.camera);
    }

}
