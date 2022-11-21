package oops.abstraction;

public class Gpay implements Payment {
    @Override
    public void makePayment() {

        System.out.println("This is Google Pay payment");
    }


    public static void main(String[] args) {

        Gpay obj= new Gpay();
        obj.makePayment();
    }
}
