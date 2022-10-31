package assignment_class_and_object;

public class MY_DEVICE {

    String name="RealME";
    String model= "X7Max";
    String RAM= "12 GB";
    String ROM= "256GB";

    public static void main(String[] args) {
        MY_DEVICE dvc = new MY_DEVICE(); // obj object created
        System.out.println("NAME : "+dvc.name);
        System.out.println("MODEL : "+dvc.model);
        System.out.println("RAM : "+dvc.RAM);
        System.out.println("ROM : "+dvc.ROM);
    }
}
