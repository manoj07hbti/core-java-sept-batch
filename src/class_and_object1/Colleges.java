package class_and_object1;

public class Colleges {
    String name;
    int No;
    String State;
    float fees;

    public Colleges(String name, int no, String state, float fees) {
        this.name = name;
        No = no;
        State = state;
        this.fees = fees;
    }

    public static void main(String[] args) {
        Colleges obj = new Colleges("IET", 226032, "Uttar Pradesh", 85460.60f);
        System.out.println("College Name:" + obj.name + " Phone NO.:" + obj.No + " State:" + obj.State + " Fees" + obj.fees);
        Colleges obj1 = new Colleges("BIET", 220415, "Uttar Pradesh", 70840.56f);
        System.out.println("College Name:" + obj1.name + " Phone NO.:" + obj1.No + " State:" + obj1.State + " Fees" + obj1.fees);
        Colleges obj2 = new Colleges("REC Banda", 251463, "Uttar Pradesh", 90456.32f);
        System.out.println("College Name:" + obj2.name + " Phone NO.:" + obj2.No + " State:" + obj2.State + " Fees"+obj2.fees);
    }
}