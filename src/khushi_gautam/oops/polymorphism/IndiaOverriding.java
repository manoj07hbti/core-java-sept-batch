package khushi_gautam.oops.polymorphism;

public class IndiaOverriding {
    public void india() {
        System.out.println("This is india vlog");
    }

    public static void main(String[] args) {
          IndiaOverriding obj = new IndiaOverriding();
          obj.india();

        IndiaOverriding obj1= new Country();
       obj1.india();
    }
}
