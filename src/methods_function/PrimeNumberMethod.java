package methods_function;

public class PrimeNumberMethod {


    // create method
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public int primeNumberMethod() {
        int number= 18;
        boolean flag = true;
        for(int i =2;i<number;i++){

            if(number%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Number is Prime number..."+number);
        }else {

            System.out.println("Number is NOT Prime number..."+number);
        }
      return 0;
    }

    public static void main(String[] args) {
        // Todo : Create object by the constructor
        // ClassName objectName = new ClassName();
           PrimeNumberMethod obj = new PrimeNumberMethod();
           int output = obj.primeNumberMethod();
        System.out.println(output);
    }
}