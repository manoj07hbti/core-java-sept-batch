package assignment_Method;

public class Method_Prime {

//    public String prime() {
        public void prime() {
        int num = 12;
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is a odd number");
        }
//            return ;
    }

    public static void main(String[] args) {
        Method_Prime obj = new Method_Prime();
        //String output = obj.prime();
        obj.prime();
    }

}
