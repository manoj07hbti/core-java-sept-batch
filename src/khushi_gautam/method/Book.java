package khushi_gautam.method;

public class Book {
    int num;
    int round;
    public void ReadMethod(){
        System.out.println("This is a read method ");
        int round =10;
        for (int i=0;i<round;i++){
            System.out.print(i + ",");
        }
        System.out.println(" ");
    }
    public void WriteMethod(){
        System.out.println("This is a write method ");
        int sum =4;
        int round = 10;
        for (int i=0;i<round;i++){
            sum= sum + (2*i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Book obj = new Book();
        obj.ReadMethod();
        obj.WriteMethod();
    }

}
