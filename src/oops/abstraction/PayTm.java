package oops.abstraction;

public class PayTm implements Payment{


    @Override
    public void makePayment() {
        System.out.println("This is  PayTM payment");
    }

    public static void main(String[] args) {

        Payment obj= new PayTm();
        obj.makePayment();
    }
}
