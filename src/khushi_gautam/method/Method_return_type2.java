package khushi_gautam.method;

public class Method_return_type2 {
    //todo syntax: access_speifier return_type method_name(parameter){..CODE..}
    public int number() {
        int n = 8;
        if (n % 2 == 0)
            System.out.println("The is even number");
        else {
            System.out.println("This is odd number");
        }
        return n;
    }
    public static void main(String[] args) {
        Method_return_type2 obj = new Method_return_type2();
        int answer = obj.number();
        System.out.println(answer);
    }
}
