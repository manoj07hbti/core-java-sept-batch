package variables;

public class VariableManipulation {

    public static void main(String[] args) {

        int a=33;
        int b=11;

        // ADDITION

        int sum=a+b;

        System.out.println("Sum is : "+sum);

        //SUB
        //MULTI
        //DIVIDE

       int result= a%b;

       System.out.println("Modulus is  :"+result);
       //UNARY Operator

        a+=b;

        System.out.println("Value of  a+=b is  "+a);

        a++;// increment operator a=a+1
        System.out.println("Value of a is after a++ : "+a);

        a--; // decrement operator a=a-1

        System.out.println("Value of a after a-- is : "+a);



    }
}
