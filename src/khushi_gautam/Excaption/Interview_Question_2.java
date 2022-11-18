package khushi_gautam.Excaption;

public class Interview_Question_2 {
    public void trial(){
        try {
            System.out.println("some code");
        }
        catch (NullPointerException e){
            System.out.println("child exception first");
        }
        catch (Exception e){
            System.out.println("then parent exception");
        }
    }

    public static void main(String[] args) {
        Interview_Question_2 obj = new Interview_Question_2();
        obj.trial();
    }
}
