package khushi_gautam.oops.polymorphism;

public class IndiaOverriding extends Country {
    public void india() {
        System.out.println("This is india vlog");
    }

    public static void main(String[] args) {
        IndiaOverriding obj= new IndiaOverriding();
        obj.parliamentMembers();
        obj.parliamentMembers("s","n");
        obj.india();

    }
}
